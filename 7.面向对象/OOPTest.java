package com.javase.august9;
/*
面向对象
java面向对象学习的三条主线：
1、java类及类的成员：属性、方法、构造器、代码块、内部类
2、面向对象的三大特征：封装性，继承性，多态性  （抽象性）
3、其他关键字的使用

面向对象的两个要素：
类：对一类事物的描述，是抽象的，概念上的定义
对象：是实际上存在的该类事物的每个体，因此也称为实例

面向对象程序设计的重点是类的设计
设计类就是设计类的成员
 */
public class OOPTest {
    public static void main(String[] args) {
        //创建类的对象 = 类的实例化 = 实例化类

        //创建personlei
        Person1 p1 = new Person1();

        //调用对象的结构、属性、方法
        //调用属性：对象.属性
        p1.name = "tom";
        p1.age = 10;
        System.out.println(p1.name);

        //调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");


        Person1 p2 = new Person1();
        System.out.println(p2.name);//null
        System.out.println(p2.isMale);//false
    }

}


//属性 = 成员变量 = field = 域、字段
//方法 = 成员方法 = 函数 = method
class Person1{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void  eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人可以说说话，使用的是" + language);
    }

}












