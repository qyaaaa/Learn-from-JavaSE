package com.javase.august20;
/*
接口的使用：
1.接口使用interface来定义
2.在Java中接口和类是并列的两个结构
3.如何定义接口：定义接口中的成员
        3.1Jdk7及以前：只能定义全局常量和抽象方法
            全局常量：public static final的,但是书写时可以省略
            抽象方法：public abstract的,书写时也可以省略

        3.2Jdk8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法

4.接口中不能定义构造器，意味着接口不可以实例化

5.在Java开发中，接口都通过让类去实现(implements)的方式来使用
    如果实现类覆盖了接口中的所有抽象方法，则此接口就可以实例化
    如果类没有覆盖接口所有的抽象方法，则此实现类仍一个抽象类

6.java类可以实现多个接口,弥补了java单继承性的局限性
    格式；class AA extends BB implements CC,DD,EE

7.接口与接口之间可以继承，而且可以多继承

8.接口的具体使用能体现多态性

9.接口实际上可以看作是一种规范
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度

    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();

    void stop();
}

interface Attackable{
    public abstract void attack();
}

class Plane implements Flyable{
    public void fly(){

        System.out.println("飞机通过引擎飞");
    }

    public void stop(){
        System.out.println("驾驶员减速停止");

    }
}

abstract class Kite implements Flyable{
    public void fly(){
        System.out.println("蝴蝶飞");
    }
}

class Bullet extends Object implements Flyable,Attackable{
    public void fly(){

        System.out.println("飞机通过引擎飞");
    }

    public void stop(){
        System.out.println("驾驶员减速停止");

    }

    public void attack(){
        System.out.println("子弹攻击");
    }
}

//*****************************

interface AA{

    void method1();
}

interface BB{

    void method2();

}

interface CC extends AA,BB{

}