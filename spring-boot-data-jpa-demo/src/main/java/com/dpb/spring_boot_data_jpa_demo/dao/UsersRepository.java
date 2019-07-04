package com.dpb.spring_boot_data_jpa_demo.dao;

/**
 * @program: spring-boot-data-jpa-demo
 * @description: Dao接口
 * @author: 波波烤鸭
 * @create: 2019-05-20 11:17
 */

import com.dpb.spring_boot_data_jpa_demo.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 参数一 T :当前需要映射的实体
 * 参数二 ID :当前映射的实体中的OID的类型
 *
 */
public interface UsersRepository extends JpaRepository<Users,Integer> {

}
