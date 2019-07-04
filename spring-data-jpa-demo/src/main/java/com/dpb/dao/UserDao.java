package com.dpb.dao;

import com.dpb.repository.UsersRepository;
import com.dpb.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SpringDataJPA 实现JpaRepository
 * 泛型 第一个参数是对应的Pojo类型
 *      第二个参数是注解的包装类型
 *  使用自定义的Repository接口
 */
public interface UserDao extends JpaRepository<Users,
        Integer>, JpaSpecificationExecutor<Users>, UsersRepository {

}
