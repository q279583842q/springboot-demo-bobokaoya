package com.dpb.dao;

import com.dpb.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * JpaSpecificationExecutor 接口讲解
 * @author Administrator
 *注意：JpaSpecificationExecutor<Users>:不能单独使用，需要配合着 jpa 中的其他接口一起使用
 */
public interface UserDao extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {

}
