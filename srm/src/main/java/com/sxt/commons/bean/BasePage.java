package com.sxt.commons.bean;

/**
 * @program: srm
 * @description: 分页的基类
 * @author: 波波烤鸭
 * @create: 2019-05-04 21:51
 */
public class BasePage {

    // 第几页
     Integer page;
    // 每页条数
     Integer rows;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
