package com.dpb.springboot.bean;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-hello
 * @description: 用户
 * @author: 波波烤鸭
 * @create: 2019-05-09 17:15
 */
@Component
@ConfigurationProperties(prefix = "users")
public class User {

    private String name;

    private String age;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
