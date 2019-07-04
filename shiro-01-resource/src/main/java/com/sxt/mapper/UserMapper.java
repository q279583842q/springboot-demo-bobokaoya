package com.sxt.mapper;

import java.util.List;

import com.sxt.pojo.User;

public interface UserMapper {

	public List<User> query(String username);
}
