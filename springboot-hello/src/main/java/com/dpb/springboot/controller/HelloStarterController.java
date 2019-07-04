package com.dpb.springboot.controller;

import com.dpb.spring_boot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springboot-hello
 * @description: 自定义starter测试
 * @author: 波波烤鸭
 * @create: 2019-05-09 21:32
 */
@RestController
public class HelloStarterController {
    @Resource
    HelloService helloService;

    @RequestMapping("/")
    public String index(){
        return helloService.sayHello();
    }
}
