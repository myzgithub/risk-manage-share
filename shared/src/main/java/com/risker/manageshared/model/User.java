package com.risker.manageshared.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by myz on 16/8/25.
 * 必须实现序列化接口
 *
 */
public class User implements Serializable{
    private Integer id;
    private String name;
    private int age;
    private Date birth;
    private char sex;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
