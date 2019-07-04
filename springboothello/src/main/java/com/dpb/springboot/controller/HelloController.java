package com.dpb.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboothello
 * @description: Hello入门案例
 * @author: 波波烤鸭
 * @create: 2019-05-08 22:50
 */
@RestController
public class HelloController {
    @GetMapping("/hello1")
    public String hello() {
        return "Hello SpringBoot ...";
    }
}
