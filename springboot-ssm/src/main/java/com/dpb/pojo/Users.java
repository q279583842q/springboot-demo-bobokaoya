package com.dpb.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @program: springboot-ssm
 * @description: 用户的实体类
 * @author: 波波烤鸭
 * @create: 2019-05-15 19:41
 */
public class Users {

    private Integer id;
    @NotBlank(message = "账号不能为空")
    @Size(max = 6,min = 2,message = "姓名的长度2~6位")
    private String name;

    @Max(value = 100)
    @Min(value=0)
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
