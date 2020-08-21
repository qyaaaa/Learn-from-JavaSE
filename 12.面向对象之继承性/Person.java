package com.javase.august15;

public class Person {

    String name;
    private int age;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    private void sleep(){
        System.out.println("睡觉");
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Object info(){
        return null;
    }
}
