package com.sxt.sys.vo;

import com.sxt.commons.bean.BasePage;
import com.sxt.sys.pojo.User;

/**
 * @program: srm
 * @description: 账号的Vo对象
 * @author: 波波烤鸭
 * @create: 2019-05-04 21:55
 */
public class UserVo extends BasePage {

    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
