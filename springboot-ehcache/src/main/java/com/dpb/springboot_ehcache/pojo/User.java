package com.dpb.springboot_ehcache.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: springboot-ehcache
 * @description: 用户对应的实体类
 * @author: 波波烤鸭
 * @create: 2019-05-17 11:22
 */
@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userid")
    private Integer userid;

    @Column(name="username")
    private String username;

    @Column(name="userage")
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
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }
}
