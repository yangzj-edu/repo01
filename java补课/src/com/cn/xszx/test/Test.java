package com.cn.xszx.test;

public class Test {

    public static void main(String[] args) {

        /**
         * 继承：
         *  子类继承父类的所有共有方法和属性
         *  子类可以拥有自己的属性和行为的
         * 在java中只有单继承，没有多继承
         * */

        B b = new B(2);

        b.id = 10;
        b.name = "张三";

        b.setPwd("123");
        String pwd = b.getPwd();
        System.out.println(pwd);

//        b.a();
        b.getB();
        String name = b.getName();

        System.out.println(name);


    }

}
