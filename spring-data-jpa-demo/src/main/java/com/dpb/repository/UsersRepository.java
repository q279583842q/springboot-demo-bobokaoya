package com.dpb.repository;

import com.dpb.pojo.Users;

/**
 * 自定义的Repository接口
 */
public interface UsersRepository {
    public Users findUserById(Integer userid);
}
