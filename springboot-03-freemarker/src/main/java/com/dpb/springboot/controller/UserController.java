package com.dpb.springboot.controller;

import com.dpb.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springboot-03-freemarker
 * @description: SpringBoot整合freemarker
 * @author: 波波烤鸭
 * @create: 2019-05-12 22:14
 */
@Controller
public class UserController {

    /*
     * 处理请求，产生数据
     */
    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<User> list = new ArrayList();
        list.add(new User(1,"张三",20));
        list.add(new User(2,"李四",22));
        list.add(new User(3,"王五",24));
        //需要一个 Model 对象
        model.addAttribute("list", list);
        //跳转视图
        return "user";
    }
}
