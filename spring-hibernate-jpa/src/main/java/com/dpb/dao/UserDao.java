package com.dpb.dao;

import com.dpb.pojo.Users;

import java.util.List;

/**
 * 定义接口中的方法
 */
public interface UserDao {

    void insertUsers(Users users);

    void updateUsers(Users users);

    void deleteUsers(Users users);

    Users selectUsersById(Integer userid);

    List<Users> selectUserByName(String username);

    List<Users> selectUserByNameUseSQL(String username);

    List<Users> selectUserByNameUseCriteria(String username);
}
