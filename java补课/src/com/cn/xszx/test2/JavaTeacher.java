package com.cn.xszx.test2;

public class JavaTeacher extends Teacher {
    public JavaTeacher(int id, String name, String type) {
        super(id, name, type);
    }

    public void showTeacher(){
        System.out.println("大家好，我叫"+getName()+"是一名Java老师");
    }

}
