package com.javase.august9;

public class Person {
    String name;
    int age;
    /**
     * 1为男0为女
     */
    int sex;
    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age:" + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}

