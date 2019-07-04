package com.dpb.springboot_ehcache.service.impl;

import com.dpb.springboot_ehcache.dao.UsersRepository;
import com.dpb.springboot_ehcache.pojo.User;
import com.dpb.springboot_ehcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @program: springboot-ehcache
 * @description: 业务层实现类
 * @author: 波波烤鸭
 * @create: 2019-05-17 11:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    @Cacheable(value="users")
    public List<User> findUserAll() {
        return this.usersRepository.findAll();
    }

    @Override
    //@Cacheable:对当前查询的对象做缓存处理
    @Cacheable(value="users")
    public User findUserById(Integer id) {
        return this.usersRepository.findById(id).get();
    }

    @Override
    @Cacheable(value="users",key="#pageable.pageSize")
    public Page<User> findUserByPage(Pageable pageable) {
        return this.usersRepository.findAll(pageable);
    }

    @Override
    //@CacheEvict(value="users",allEntries=true) 清除缓存中以users缓存策略缓存的对象
    @CacheEvict(value="users",allEntries=true)
    public void saveUsers(User users) {
        this.usersRepository.save(users);
    }
}
