package com.dpb.spring_boot_data_jpa_demo.dao;

import com.dpb.spring_boot_data_jpa_demo.pojo.Users;
import org.springframework.data.repository.CrudRepository;


/**
 * CrudRepository接口
 *
 *
 */
public interface UsersRepositoryCrudRepository extends CrudRepository<Users, Integer> {

}
