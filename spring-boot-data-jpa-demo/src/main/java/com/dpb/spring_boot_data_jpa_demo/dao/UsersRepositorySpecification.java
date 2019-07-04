package com.dpb.spring_boot_data_jpa_demo.dao;

import com.dpb.spring_boot_data_jpa_demo.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 
 *JpaSpecificationExecutor
 *
 */
public interface UsersRepositorySpecification extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {

}
