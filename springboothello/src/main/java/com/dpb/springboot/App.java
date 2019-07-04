package com.dpb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboothello
 * @description: SpringBoot的启动类
 * @author: 波波烤鸭
 * @create: 2019-05-08 22:49
 */
@EnableAutoConfiguration
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot ...";
    }

}

