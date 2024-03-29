package com.dpb.springboot.pojo;

/**
 * @program: springboot-03-freemarker
 * @description: 账号
 * @author: 波波烤鸭
 * @create: 2019-05-12 22:13
 */
public class User {
    private Integer userid;

    private String username;

    public User(Integer userid, String username, Integer userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }

    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
