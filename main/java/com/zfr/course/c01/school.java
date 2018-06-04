package com.zfr.course.c01;

import java.util.ArrayList;
import java.util.List;

public class school {
    private  int id=100001;
    private String name = "hbxy";
    private Student student;



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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private List<Student> studentList= new ArrayList();

    public List<Student> getStudentList() {
        studentList.add(student);
        return studentList;
    }




}
