package com.javase.august15;

public class Student extends Person {

    String major;

    public Student(){

    }

    public Student(String name,int age,String major){
        this.name = name;

        this.major = major;

    }

    public void study(){
        System.out.println("学习");
    }

    //对父类的eat方法进行了重写
    public void eat(){
        System.out.println("吃有营养的食物");
    }

    public String info(){
        return null;
    }

}
