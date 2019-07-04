package com.dpb.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @program: springboot-02-jsp
 * @description: SpringBoot整合jsp
 * @author: 波波烤鸭
 * @create: 2019-05-12 21:19
 */
@Controller
public class UserController {

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String query(Model model){
       model.addAttribute("list",Arrays.asList("张三","李四","王五"));
        return "user";
    }
}
