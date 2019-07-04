package com.sxt.sys.vo;

import com.sxt.commons.bean.BasePage;
import com.sxt.sys.pojo.Menu;

/**
 * @program: srm
 * @description: 菜单的传输对象
 * @author: 波波烤鸭
 * @create: 2019-05-04 23:20
 */
public class MenuVo extends BasePage {

    Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
