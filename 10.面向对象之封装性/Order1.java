package com.javase.august13;

public class Order1 {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

    }
    public void methodPublic(){

        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
