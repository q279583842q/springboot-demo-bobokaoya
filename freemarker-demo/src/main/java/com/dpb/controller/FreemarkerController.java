package com.dpb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: freemarker-demo
 * @description: FreemarkerDemo
 * @author: 波波烤鸭
 * @create: 2019-05-15 23:09
 */
@Controller
public class FreemarkerController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
