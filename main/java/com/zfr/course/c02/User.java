package com.zfr.course.c02;

public class User {
    private String name;
    private String sex;
    //构造函数
    public User(){

    }
    public User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
