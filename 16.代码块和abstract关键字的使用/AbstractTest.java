package com.javase.august19;
/*
abstract关键字的使用：
1.abstract：抽象的
2.abstract可以用来修饰的结构：类、方法
3.abstract修饰类：抽象类
        ①此类不能实例化
        ②抽象类中一定有构造器，便于子类实例化时调用
        ③开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作。

4.abstract修饰方法：抽象方法
        ①只有方法的声明，没有方法体
        ②包含抽象方法的类一定是一个抽象类，反之抽象类中可以没有抽象方法
        ③若子类重写了父类中所有的抽象方法后，此子类方可实例化
         若子类没有抽象父类中的所要的抽象方法，此子类也是一个抽象类，需要使用abstract修饰

 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象就不可实例化
        //Person1 p1 = new Person1();
        //p1.eat();
    }
}

abstract class Person1{
        String name;
        int age;

    public Person1() {
    }

    public Person1(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public abstract void sleep();//抽象方法

    public void walk(){
        System.out.println("人走路");
    }
}
//abstract
class Student extends Person1{

    public Student(String name,int age) {
        super();
    }

    @Override
    public void sleep(){
        System.out.println("人睡觉");
    }

}
