package com.javase.august15;
/*
面向对象的特征之二：继承性

一、继承性的好处：
①减少了代码的冗余，提高了代码的复用性
②便于功能的扩展
③为之后的多态性的使用提供了前提

二、继承性·的格式 class A extends B{}
    A：子类、派生类 subclass
    B、父类、超类 superclass

    体现：①一旦子类A继承父类B就获取了父类B中声明的结构、属性、方法
     特别的，父类中声明为private的属性或方法，继承后，仍然认为获取了父类中私有的结构
     只是因为封装性的影响无法调用
     ②子类继承父类以后，还可以声明自己特有的属性或方法，实现功能的拓展。
     子类和父类的关系，不同于子集和集合的关系

三、java中关于继承性的规定
    1.一个类可以被多个子类继承
    2.Java中的单继承性，一个类只能继承一个父类
    3.子父亲类是相对的概念
    4.子类直接继承的父类称为直接父类，间接继承的父类称为间接父类
    5.子类一旦继承父类就继承所有的间接父类

四、1.如果我们没有显示的声明一个类的父类的话，则此类继承于java。lang.Object
   2.所有的java类直接或间接继承于java。lang.Object
   3.意味着，所有的java类具有java。lang.Object类声明的功能
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();


        Student s = new Student();
        s.eat();
        s.study();
        s.setAge(20);
        System.out.println(s.getAge());
    }

}
