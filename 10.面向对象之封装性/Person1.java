package com.javase.august13;
/*
类的结构之三：构造器的使用

一、构造器的作用：
1.创建对象
2.初始化对象属性

二、说明：
1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
2.定义构造器的格式，权限修饰符 类名（形参列表）{}
3、一个类中定义的多个构造器，彼此形成重载
4.一旦我们显示的定义了类的构造器之后，系统就不再提供默认的空参构造器
5.一个类中至少有一个构造器
 */
public class Person1 {
    public static void main(String[] args) {
        Person2 p = new Person2("tom");
        p.eat();

        System.out.println(p.name);
    }
}

class Person2{
    //属性
    String name;
    int age;

    //构造器
    public Person2(){
        System.out.println("Person()........");
    }

    public Person2(String n){
        name = n;
    }

    //方法
    public void eat(){
        System.out.println("吃");
    }

    public void show(){
        System.out.println("展示");
    }
}
