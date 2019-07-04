package com.sxt.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.sys.mapper.UserMapper;
import com.sxt.sys.pojo.User;
import com.sxt.sys.pojo.UserExample;
import com.sxt.sys.service.IUserService;
import com.sxt.sys.vo.UserVo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @program: srm
 * @description: 用户业务层的实现
 * @author: 波波烤鸭
 * @create: 2019-05-03 22:18
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 登录校验
     *      根据账号校验
     * @param userName
     * @return
     */
    @Override
    public List<User> login(String userName) {
        UserExample example = new UserExample();
        // 添加查询条件 状态1活动 0 冻结
        example.createCriteria().andUsernameEqualTo(userName).andStateEqualTo("1");
        // 查询结果并返回
        return userMapper.selectByExample(example);
    }

    @Override
    public PageInfo<User> query(UserVo userVo) {
        PageHelper.startPage(userVo.getPage(),userVo.getRows());
        UserExample example = new UserExample();
        List<User> list = userMapper.selectByExample(example);
        PageInfo<User> info = new PageInfo(list);
        return info;
    }

    @Override
    public int update(User user) {

        return 0;
    }

    @Override
    public int updateByPrimaryKey(User user) {

        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int save(User user) {
        user.setCreateDatetime(new Date());
        // 创建盐值
        String salt = UUID.randomUUID().toString().substring(1,4);
        // 对密码加密
        user.setPassword(new Md5Hash(user.getPassword(),salt,1024).toString());
        user.setSalt(salt);
        // 设置状态为1 激活状态
        user.setState("1");
        // 插入用户数据
        return userMapper.insertSelective(user);
    }
}
