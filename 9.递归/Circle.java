package com.javase.august12;
/*
定义一个Circle类，包含一个double型的radius属性代表圆的面积
一个findArea（）方法返回圆的面积
 */
public class Circle {
    double raduis;
    public double findArea(){
        return Math.PI * raduis * raduis;
    }
}
