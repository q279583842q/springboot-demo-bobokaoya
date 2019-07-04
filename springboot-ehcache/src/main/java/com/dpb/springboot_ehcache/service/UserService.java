package com.dpb.springboot_ehcache.service;

import com.dpb.springboot_ehcache.pojo.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {


    List<User> findUserAll();
    User findUserById(Integer id);
    Page<User> findUserByPage(Pageable pageable);
    void saveUsers(User users);
}
