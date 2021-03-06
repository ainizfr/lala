package com.zfr.course.c06.model;

public class User {

        private int id;
        private String name;
        private String sex;
        private String email;

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



        public String toString(){
            StringBuffer stringBuffer=new StringBuffer();
            stringBuffer.append("id=");
            stringBuffer.append(id);
            stringBuffer.append("\n");
            stringBuffer.append("name=");
            stringBuffer.append(name);
            return  stringBuffer.toString();
        }


}
