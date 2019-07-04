package com.sxt.sys.service;

import com.github.pagehelper.PageInfo;
import com.sxt.sys.pojo.User;
import com.sxt.sys.vo.UserVo;

import java.util.List;

/**
 * 用户的业务层接口
 */
public interface IUserService {

     /**
      * 登录认证
      * @param userName
      * @return
      */
     List<User> login(String userName);

     /**
      * 分页查询账号信息
      * @param userVo
      * @return
      */
     PageInfo<User> query(UserVo userVo);

     /**
      * 更新账号信息
      * @param user
      * @return
      */
     int update(User user);

     /**
      * 根据主键更新账号信息
      * @param user
      * @return
      */
     int updateByPrimaryKey(User user);

     /**
      * 保存用户信息
      * @param user
      * @return
      */
     int save(User user);
}
