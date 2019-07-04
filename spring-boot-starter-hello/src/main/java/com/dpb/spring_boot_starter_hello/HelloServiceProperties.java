package com.dpb.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: spring-boot-starter-hello
 * @description: 属性配置类
 * @author: 波波烤鸭
 * @create: 2019-05-09 20:52
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
