package com.javase.august12;
/*
定义一个PassObject类，在类中定义一个方法printAreas（），该方法定义如下：
public void printAreas（Circle c，int time）
在该方法中打印输出1到time之间的每个整数半径值，以及对应的圆的面积

在main方法中调用printAreas（）方法，输出当前半径值
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c,5);

    }
    public void printAreas(Circle c, int time){
        System.out.println("Radiuss\t\tArea");

        for(int i = 1;i <= time;i++){
            //设置圆的半径
            c.raduis = i;
            System.out.println(c.raduis + "\t\t" + c.findArea());
        }

    }
}
