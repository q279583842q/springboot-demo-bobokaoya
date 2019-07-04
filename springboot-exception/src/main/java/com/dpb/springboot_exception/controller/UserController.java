package com.dpb.springboot_exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: springboot-exception
 * @description: 异常处理案例
 * @author: 波波烤鸭
 * @create: 2019-05-17 09:42
 */
@Controller
public class UserController {

    /**
     * 模拟 NullPointerException
     * @return
     */
    @RequestMapping("/show1")
    public String showInfo(){
        String str = null;
        str.length();
        return "index";
    }

    /**
     * 模拟 ArithmeticException
     * @return
     */
    @RequestMapping("/show2")
    public String showInfo2(){
        int a = 10/0;
        return "index";
    }
}
