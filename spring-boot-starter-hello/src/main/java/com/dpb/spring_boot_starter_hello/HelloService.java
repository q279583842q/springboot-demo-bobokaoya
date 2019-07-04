package com.dpb.spring_boot_starter_hello;

/**
 * @program: spring-boot-starter-hello
 * @description: 判断依据类
 * @author: 波波烤鸭
 * @create: 2019-05-09 20:58
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello "+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
