package com.zfr.course.aophome;

public class User {
    private  String name ="张锋瑞";
    private  String sex="男";
    private  String email="zhangrui83@OUTLOOK.COM";
    private  int id=15112071;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void saveUser(){
        System.out.println("保存用户信息。。。");
    }
    public void queryUser(){
        System.out.println("业务类    查看用户信息");
        System.out.println(this.name+"\t"+this.sex+"\t"+this.id+"\t"+this.email);
    }
}
