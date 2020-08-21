package com.javase.august17;

import java.util.concurrent.Callable;

public class Circle extends  GeometricObject{
    private double radius;

    public Circle() {
        super();
        radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle c1 = (Circle)obj;
            return this.radius == c1.radius;
        }
        return false;
    }

    public String toString(){
        return "radius = " + radius;
    }
}
