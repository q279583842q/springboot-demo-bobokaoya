package com.sxt.sys.vo;

import com.sxt.commons.bean.BasePage;
import com.sxt.sys.pojo.Role;

/**
 * @program: srm
 * @description: 角色信息的包装对象
 * @author: 波波烤鸭
 * @create: 2019-05-04 22:53
 */
public class RoleVo extends BasePage {

    Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
