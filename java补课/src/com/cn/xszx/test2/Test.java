package com.cn.xszx.test2;

public class Test {

    public static void main(String[] args) {

        School school = new School();

        DBTeacher teacher = new DBTeacher(1,"张三","asdas");

        school.showTeacher(teacher);


    }

}
