package com.sxt.sys.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: srm
 * @description: 管理账号登录和注销的工具类
 * @author: 波波烤鸭
 * @create: 2019-05-04 22:26
 */
@Controller
public class LoginController {

    @RequestMapping("/sys/logout.do")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "login";
    }
}
