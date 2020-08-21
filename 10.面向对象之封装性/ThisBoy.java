package com.javase.august13;

public class ThisBoy {
    String name;
    int age;

    public ThisBoy(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void marry(ThisGirl thisGirl){
        System.out.println("我想娶" + thisGirl.getName());

    }

    public void shout(){
        if(age > 24){
            System.out.println("你可以结婚");
        }else {
            System.out.println("你不可以结婚");
        }
    }

}
