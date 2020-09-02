package com.cn.xszx.test2;

public class DBTeacher extends Teacher {
    public DBTeacher(int id, String name, String type) {
        super(id, name, type);
    }

    public void showTeacher(){
        System.out.println("大家好，我叫"+getName()+"是一名DB老师");
    }

}
