package com.javase.august18;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/*
单例的懒汉式的实现
 */
public class SingLetonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();

        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);

    }
}
class Order{

    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类的对象，没有初始化
    //4.对象必须声明为static
    private static Order instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}