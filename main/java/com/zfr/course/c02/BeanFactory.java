package com.zfr.course.c02;

public class BeanFactory {
    public static  User createUser(){
        User user=new User();
        user.setName("张锋瑞");
        user.setSex("男");
        return user;
    }
}
