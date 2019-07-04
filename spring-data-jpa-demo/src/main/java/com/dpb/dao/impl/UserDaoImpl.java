package com.dpb.dao.impl;

import com.dpb.pojo.Users;
import com.dpb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

/**
 * @program: spring-data-jpa-demo
 * @description: 创建接口的实现类
 * @author: 波波烤鸭
 * @create: 2019-05-18 20:31
 */
public  class UserDaoImpl implements UsersRepository {

    @Autowired
    private EntityManager em;

    @Override
    public Users findUserById(Integer userid) {
        System.out.println("MyRepository ....");
        return em.find(Users.class,userid);
    }
}
