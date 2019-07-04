package com.sxt.sys.pojo;

import java.util.Date;

public class Basic {
    private Integer basicId;

    private String basicName;

    private String basicDesc;

    private Integer parentId;

    private Date createTime;

    private String b1;

    private String b2;

    private String b3;

    public Integer getBasicId() {
        return basicId;
    }

    public void setBasicId(Integer basicId) {
        this.basicId = basicId;
    }

    public String getBasicName() {
        return basicName;
    }

    public void setBasicName(String basicName) {
        this.basicName = basicName == null ? null : basicName.trim();
    }

    public String getBasicDesc() {
        return basicDesc;
    }

    public void setBasicDesc(String basicDesc) {
        this.basicDesc = basicDesc == null ? null : basicDesc.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1 == null ? null : b1.trim();
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2 == null ? null : b2.trim();
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3 == null ? null : b3.trim();
    }
}