package com.dpb.spring_boot_data_jpa_demo.dao;

import com.dpb.spring_boot_data_jpa_demo.pojo.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 
 *PagingAndSortingRepository接口
 *
 */
public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<Users,Integer> {

}
