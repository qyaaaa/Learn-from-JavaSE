package com.javase.august17;



public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("颜色是否相等" +c1.getColor().equals(c2.getColor()));

        System.out.println("半径是否相等" + c1.equals(c2));
    }
}
