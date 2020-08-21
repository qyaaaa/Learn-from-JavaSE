package com.javase.august10;
/*
方法的重载：
同一个方法中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
    两同一不同：同一个类，相同方法名
             参数列表不同，参数个数不同，参数类型不同
 */
public class OverLoadTest {
    public static void main(String[] args) {

    }

    //如下的四个方法构成了重载
    public void getSum(int i,int j){
        System.out.println(i + j);
    }

    public void getSum(double d1,double d2){

        System.out.println(2);
    }

    public void getSum(String s1,int i){

        System.out.println(3);
    }

    public void getSum(int i,String s1){

        System.out.println(4);
    }
}
