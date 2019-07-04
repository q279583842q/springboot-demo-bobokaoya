package com.dpb.pojo;

import java.io.Serializable;

/**
 * @program: spring-data-redis-demo
 * @description: Users对象
 * @author: 波波烤鸭
 * @create: 2019-05-20 09:34
 */
public class Users implements Serializable {

    private Integer userid;

    private String username;

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

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    public Users() {
    }

    public Users(Integer userid, String username, Integer userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }
}
