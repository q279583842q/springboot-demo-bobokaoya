package com.dpb.service.impl;

import com.dpb.service.UserService;

/**
 * @program: dubbo-parent
 * @description: 公共接口的实现类
 * @author: 波波烤鸭
 * @create: 2019-05-13 20:34
 */
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String msg) {
        System.out.println("服务端接收:"+msg);
        return "你好啊";
    }
}
