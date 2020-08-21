package com.javase.august15;

public class SuperStudent extends SuperPerson{

    String major;
    int id = 1002;//学号

    public SuperStudent(){

    }

    public SuperStudent(String name,int age,String major){
        super(name,age);
        this.major = major;
    }

    public SuperStudent(String major){
        this.major = major;
    }

    @Override
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void study(){
        System.out.println("学习");
        this.eat();
        super.eat();
    }


    public void show(){
        System.out.println("学生姓名为：" + name + "学生年龄为：" + age);
        System.out.println("id = " + this.id);
        System.out.println("id = " + super.id);
    }
}
