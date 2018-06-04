package com.zfr.course.aophome;


public class Useraop {
    public void Before(){
        System.out.println("切面类   方法执行之前");
        User a=new User();
        a.setName("张锋瑞   -  切面类");
        System.out.println(a.getName());

    }
    public  void After(){
        System.out.println("切面类    方法执行之后");
        User b=new User();
        b.setName("张锋瑞   -  切面类  -  哈哈哈哈");
        System.out.println(b.getName());

    }
}
