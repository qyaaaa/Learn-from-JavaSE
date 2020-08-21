package com.javase.august16;

public class PersonWomen extends Person {
    boolean isBeauty;

    public void goShopping(){
        System.out.println("购物");
    }

    @Override
    public void eat() {
        System.out.println("少吃");
    }

    @Override
    public void walk() {
        System.out.println("窈窕的走路");
    }
}
