package com.zfr.course.c02;

import org.springframework.stereotype.Component;
@Component("teacher")
public class Teacher {
    //属性注入
    //构造函数注入


        private int id =20180101;
        private String name="张锋瑞";
        private String sex;
        private String email;

        public String toString(){
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append("id");
            stringBuffer.append(id);
            stringBuffer.append("\n");
            stringBuffer.append("name=");
            stringBuffer.append(name);
            return stringBuffer.toString();
        }

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

}
