package com.atguigu.pojo;

import java.io.Serializable;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-0:15
 */
public class User implements Serializable {

    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Integer age;
    private String phone;

    public User() {
    }

    public User(String name, String password, String sex, Integer age, String phone) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
