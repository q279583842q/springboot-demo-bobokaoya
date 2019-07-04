package com.dpb.springboot.controller;

import com.dpb.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @program: springboot-thymeleafnew
 * @description: Thymeleaf入门案例
 * @author: 波波烤鸭
 * @create: 2019-05-15 09:52
 */
@Controller
public class DemoController {


    @RequestMapping("/{page}")
    public String showInfo(@PathVariable String page, Integer id, String name){
        System.out.println(id+"--"+name);
        return page;
    }
}
