package com.dpb.service;

import com.dpb.pojo.Users;

import java.util.List;

public interface UsersService {

    public List<Users> query();

    public void insertUser(Users users);

    Users queryUsersById(Integer id);

    public void updateUser(Users users);

    public void delete(Integer id);
}
