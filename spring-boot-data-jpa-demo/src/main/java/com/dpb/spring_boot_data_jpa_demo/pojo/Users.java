package com.dpb.spring_boot_data_jpa_demo.pojo;

import javax.persistence.*;

/**
 * @program: spring-boot-data-jpa-demo
 * @description: pojo
 * @author: 波波烤鸭
 * @create: 2019-05-20 11:15
 */
@Entity
@Table(name="t_users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

    @Column(name="address")
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
    }


}

