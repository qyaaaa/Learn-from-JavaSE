package com.javase.august18;
//static关键字的应用
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("id为" + c2.getId());
        System.out.println("圆的个数为" + Circle.getTotal());
    }
}
class Circle{
    private double radius;
    private int id;

    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    private static int total;//记录创建圆的个数
    private static int init = 1001;//static声明的属性被所有对象共享

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
