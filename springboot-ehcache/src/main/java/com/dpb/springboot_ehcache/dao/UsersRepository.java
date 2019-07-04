package com.dpb.springboot_ehcache.dao;

import com.dpb.springboot_ehcache.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springboot-ehcache
 * @description: 持久层实现Jpa
 * @author: 波波烤鸭
 * @create: 2019-05-17 11:25
 */
public interface UsersRepository extends JpaRepository<User,Integer> {

}
