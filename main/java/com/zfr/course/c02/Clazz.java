package com.zfr.course.c02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("clazz")//班级
public class Clazz {
    private int id=1501;
    private String name = "物联网";
    @Autowired
    private Teacher teacher;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("基于注解的注入");
        stringBuffer.append("\n");
        stringBuffer.append("id");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        stringBuffer.append("\n");
        stringBuffer.append("班主任");
        stringBuffer.append(teacher.toString());
        stringBuffer.append("  ");
        return  stringBuffer.toString();
    }
}
