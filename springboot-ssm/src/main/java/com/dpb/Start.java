package com.dpb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-ssm
 * @description: 启动类
 * @author: 波波烤鸭
 * @create: 2019-05-15 19:39
 */
@SpringBootApplication
@MapperScan("com.dpb.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
