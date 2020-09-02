package com.cn.xszx.test;

public interface MyInterface extends MyInterface1,MyInterface2 {

    /**
     * java中对于类而言只有单继承，没有多继承，但是可以使用接口的方式来实现多继承关系
     * */

    int DAY = 7;

    /**
     * 常量一般都定义在接口中
     *
     * JDK1.8之前接口中只能有抽象方法，只能被public修饰
     * 接口就是用来被实现的，实现接口必须重写所有的抽象方法
     * 接口中不能有普通方法，但是JDK1.8之后接口中可以有静态方法和默认方法
     *
     * 接口也没有构造函数，接口无法被实例化
     *
     * */

    void a();

    static void b(){
        System.out.println("我是接口中的静态方法");
    }

    default void c(){
        System.out.println("我是接口中的默认方法");
    }

}
