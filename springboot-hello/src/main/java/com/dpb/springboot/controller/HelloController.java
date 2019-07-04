package com.dpb.springboot.controller;

import com.dpb.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-hello
 * @description: Hello 案例
 * @author: 波波烤鸭
 * @create: 2019-05-08 21:10
 */
@RestController
public class HelloController {
    /*@Value("${user.username}")
    private String name;
    @Value("${user.age}")
    private int age;
    @Value("${user.address}")
    private String address;*/

    @Autowired
    private User user;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot ... "+user.getName()+" "+user.getAge()+" "+user.getAddress();
    }
}
