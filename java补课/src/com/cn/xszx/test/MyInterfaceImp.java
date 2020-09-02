package com.cn.xszx.test;

public class MyInterfaceImp implements MyInterface {

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    /**
     * 当实现一个接口时，必须重写接口中偶所有的抽象方法，包括接口父类中的所有抽象方法
     * */

    @Override
    public void a() {
        System.out.println("我是重写的接口中的方法a");
    }

    @Override
    public void c(){
        System.out.println("我是重写的接口中的默认方法c");
    }

}
