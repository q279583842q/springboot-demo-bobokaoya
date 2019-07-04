package com.sxt.sys.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String username;

    private String password;

    private String nickname;

    private String salt;

    private Date createDatetime;

    private Date lastLoginTime;

    // 1 正常  0 冻结
    private String state;

    private String u1;

    private String u2;

    private String u3;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getU1() {
        return u1;
    }

    public void setU1(String u1) {
        this.u1 = u1 == null ? null : u1.trim();
    }

    public String getU2() {
        return u2;
    }

    public void setU2(String u2) {
        this.u2 = u2 == null ? null : u2.trim();
    }

    public String getU3() {
        return u3;
    }

    public void setU3(String u3) {
        this.u3 = u3 == null ? null : u3.trim();
    }
}