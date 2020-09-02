package com.cn.xszx.test;

public class B extends A {

    /**
     * 方法的重写（基于继承/接口）
     * 方法名一样，方法的参数也一样，方法的权限修饰符越来越大，方法的执行体不一样
     * 被final修饰的方法无法被重写
     *
     * 对于构造函数子类默认调用父类的构造函数(首先调用一次父类的构造函数)
     * */

    public String name;

    public B(int id) {
        //代表调用了父类的构造函数,如果没有有参的构造函数，那么super()可以忽略也将默认存在
        //当子类的构造函数中使用到父类的super()构造函数，那么super()必须方法第一行执行
        super(id);
        System.out.println("是子类的构造函数");

    }

    @Override
    public void a(){
        /**
         * 加入在子类的方法中需要执行一个父类的方法
         * */

        System.out.println("这是子类的方法a");
    }

    public void getB(){
        super.a();
    }

}
