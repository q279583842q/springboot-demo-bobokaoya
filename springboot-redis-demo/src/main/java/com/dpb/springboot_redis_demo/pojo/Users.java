package com.dpb.springboot_redis_demo.pojo;

import java.io.Serializable;

/**
 * @program: springboot-redis-demo
 * @description: Users
 * @author: 波波烤鸭
 * @create: 2019-05-20 23:47
 */
public class Users implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Users [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
