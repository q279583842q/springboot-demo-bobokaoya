package com.sxt.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.sys.mapper.RoleMapper;
import com.sxt.sys.pojo.Role;
import com.sxt.sys.pojo.RoleExample;
import com.sxt.sys.service.IRoleService;
import com.sxt.sys.vo.RoleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: srm
 * @description: 角色业务层的实现类
 * @author: 波波烤鸭
 * @create: 2019-05-04 22:55
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Resource
    RoleMapper roleMapper;

    @Override
    public PageInfo<Role> query(RoleVo roleVo) {
        PageHelper.startPage(roleVo.getPage(),roleVo.getRows());
        RoleExample example = new RoleExample();
        List<Role> list = roleMapper.selectByExample(example);
        PageInfo<Role> info = new PageInfo<>(list);
        return info;
    }
}
