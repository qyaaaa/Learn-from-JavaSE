package com.javase.august16;

public class PersonMan extends Person{
    boolean isSmoke;

    public void earnMoney(){
        System.out.println("挣钱");
    }

    @Override
    public void eat() {
        System.out.println("吃得多");
    }

    @Override
    public void walk() {
        System.out.println("威武的走路");
    }
}
