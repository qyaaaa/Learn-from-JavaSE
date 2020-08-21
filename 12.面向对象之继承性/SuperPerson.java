package com.javase.august15;

public class SuperPerson {
    String name;
    int age;
    int id = 1001;//学号

    public SuperPerson(){
        System.out.println("我无处不在");
    }

    public SuperPerson(String name){
        this.name = name;
    }

    public SuperPerson(String name,int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}
