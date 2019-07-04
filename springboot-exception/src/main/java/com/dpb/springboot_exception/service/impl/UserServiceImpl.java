package com.dpb.springboot_exception.service.impl;

import com.dpb.springboot_exception.dao.UserDao;
import com.dpb.springboot_exception.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @program: springboot-exception
 * @description: 业务层实现类User
 * @author: 波波烤鸭
 * @create: 2019-05-17 10:26
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public void insertUser() {
        userDao.insertUser();
    }
}
