package com.sxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxt.mapper.UserMapper;
import com.sxt.pojo.User;
import com.sxt.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper mapper;

	@Override
	public List<User> login(String userName) {
		return mapper.query(userName);
	}

}
