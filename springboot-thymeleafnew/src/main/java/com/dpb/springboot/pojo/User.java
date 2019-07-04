package com.dpb.springboot.pojo;

/**
 * @program: springboot-thymeleafnew
 * @description: User
 * @author: 波波烤鸭
 * @create: 2019-05-15 11:15
 */
public class User {
    private Integer id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    private String username;

    private Integer userage;

    public User(Integer id, String username, Integer userage) {
        this.id = id;
        this.username = username;
        this.userage = userage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
