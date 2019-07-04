package com.sxt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: srm
 * @description: 页面控制器
 * @author: 波波烤鸭
 * @create: 2019-05-03 19:53
 */
@Controller
public class PageController {

    /**
     * 跟目录就跳转到login.jsp页面
     * @return
     */
    @RequestMapping("/")
    public String showMain(){
        return "login";
    }

    /**
     * restful 风格
     *    传递的是什么数据就跳转到对应的页面
     * @param path
     * @return
     */
    @RequestMapping("/{path}")
    public String showTop(@PathVariable String path){
        return path;
    }

    /**
     * restful 风格
     *    传递的是什么数据就跳转到对应的页面
     * @param path1
     * @param path2
     * @param path3
     * @return
    */
    @RequestMapping("/{path1}/{path2}/{path3}/go")
    public String showTop3(@PathVariable String path1,@PathVariable String path2,@PathVariable String path3){
        return path1+"/"+path2+"/"+path3;
    }


}

