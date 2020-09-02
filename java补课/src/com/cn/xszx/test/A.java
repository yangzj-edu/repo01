package com.cn.xszx.test;

public class A {

    public int id;
    public String name;
    private String pwd;

//    public A() {
//        System.out.println("这是父类的构造函数");
//    }

    public A(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void a(){
        System.out.println("这是父类方法a");
    }

    public String getName(){
        return name;
    }

}
