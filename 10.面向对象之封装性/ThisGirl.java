package com.javase.august13;

public class ThisGirl {

    String name;
    int age;

    public ThisGirl(){

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

    public void marry(ThisBoy thisBoy){
        System.out.println("我想嫁给" + thisBoy.getName());
        //thisBoy.marry(new ThisGirl());
    }

    public int compare(ThisGirl thisgirl){
        return this.age - thisgirl.age;
    }
}
