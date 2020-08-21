package com.javase.august17;
/*
java.lang.Object类
1.Object类是所有java类的根父类
2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
3.Object类中的功能（属性、方法）具有通用性
属性：无
方法：equals（）/toString（）/getClass（）。。。。。。。。。。。。。
4.Object类只声明了一个空参构造器
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order1 order = new Order1();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order1{

    private double orderId;
}
