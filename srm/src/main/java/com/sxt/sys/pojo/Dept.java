package com.sxt.sys.pojo;

import java.util.Date;

public class Dept {
    private Integer deptId;

    private String deptName;

    private Integer parentId;

    private String deptDesc;

    private Date createTime;

    private String d1;

    private String d2;

    private String d3;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc == null ? null : deptDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1 == null ? null : d1.trim();
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2 == null ? null : d2.trim();
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3 == null ? null : d3.trim();
    }
}