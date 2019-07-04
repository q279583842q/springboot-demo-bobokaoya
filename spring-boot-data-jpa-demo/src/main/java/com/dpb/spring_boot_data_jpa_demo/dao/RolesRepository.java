package com.dpb.spring_boot_data_jpa_demo.dao;

import com.dpb.spring_boot_data_jpa_demo.pojo.Roles;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * RolesRepository
 *
 *
 */
public interface RolesRepository extends JpaRepository<Roles,Integer> {

}
