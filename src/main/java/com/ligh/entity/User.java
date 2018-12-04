package com.ligh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class User {

   // @JsonIgnore   //数据不会返回显示
    private String name;

    private Integer age;

    private String desc;

    // locale 表示地区 zh 中国
    //timezone 时间区  中国在东八区

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
    private Date birth;

    public User() {
    }

    public User(String name, Integer age, String desc, Date birth) {
        this.name = name;
        this.age = age;
        this.desc = desc;
        this.birth = birth;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
