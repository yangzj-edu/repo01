package com.cn.xszx.test;

public abstract class AA {

    /**
     * 抽象类：
     *  abstract修饰的类就是一个抽象类
     *  抽象类就是为了被别人继承的，抽象类不能被实例化，抽象类是有构造函数的
     *
     *  抽象类中可以有普通方法和抽象方法,但是如果此类在有至少一个抽象方法，那么此类一定是一个抽象类
     *
     *  抽象方法：
     *      没有实现提，不能是private修饰的
     *
     * */

    public void a(){
        System.out.println("我是抽象类中的普通方法");
    }

    public abstract void b();



}
