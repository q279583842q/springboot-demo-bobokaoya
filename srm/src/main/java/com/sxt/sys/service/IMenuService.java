package com.sxt.sys.service;

import com.sxt.sys.pojo.Menu;

import java.util.List;

/**
 * 菜单业务层定义的方法
 */
public interface IMenuService {

    /**
     * 查询菜单信息
     * @param menu
     * @return
     */
    public List<Menu> query(Menu menu);

}
