package com.dpb.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: spring-hibernate
 * @description: Users的Pojo对象
 * @author: 波波烤鸭
 * @create: 2019-05-18 09:37
 */

@Entity
@Table(name="users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
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
        return "Users [userid=" + userid + ", username=" + username + ", userage=" + userage + "]";
    }

}
