package com.dpb.springboot_exception.dao.impl;

import com.dpb.springboot_exception.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @program: springboot-exception
 * @description: 用户持久层实现类的测试
 * @author: 波波烤鸭
 * @create: 2019-05-17 10:24
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser() {
        System.out.println("-------userDao 方法执行了------");
    }
}
