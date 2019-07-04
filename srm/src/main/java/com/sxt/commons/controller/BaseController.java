package com.sxt.commons.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Security;

/**
 * @program: srm
 * @description: 基础控制器
 * @author: 波波烤鸭
 * @create: 2019-05-04 09:09
 */
public abstract class BaseController {


    /**
     * 获取Shiro中的Session对象
     * @return
     */
    Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }

    
}
