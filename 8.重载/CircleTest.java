package com.javase.august10;
/*
设计Circle类计算圆的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 1.5;
        //double area = c1.findArea();
        //System.out.println(area);

        c1.findArea();
    }
}
class Circle{

    //属性
    double radius;

    //求圆的面积,方法①
    /*
    public double findArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    */

    //方法②
    public void findArea(){
        System.out.println("面积为" + (Math.PI * radius * radius));
    }

}
