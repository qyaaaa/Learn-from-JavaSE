package com.javase.august17;
/*
Object中toString（）使用
1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString（）

2.像String、Date、File、包装类都重写了Object中的toString()方法
  使得调用对象的toString时，返回实体信息

3.自定义的也可以重写toString（）方法，当调用此方法时，返回对象的实体内容

 */
public class ToStringTest {
    public static void main(String[] args) {
        Person p1 = new Person("tom",20);

        System.out.println(p1.toString());//没重写的话是地址值

        String str = new String("MM");
        System.out.println(str);//MM


    }
}
