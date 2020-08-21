package com.javase.august17;
/*
面试题  == 和equals（）区别
一、回顾==的使用：
 ==运算符
 1.可以使用在基本数据类型和引用数据类型中
 2.如果比较的是基本数据类型，比较变量保存的数据是否相同（不一定类型要相同）
   如果比较的是引用数据类型，比较变量保存的是地址值是否相同，即两个引用是否指向同一个实体对象

二、equal（）方法的使用：
1.是一个方法而非运算符
2.只能适用于引用数据类型
3.Object类中定义的方法和 == 相同
4.像String、Data、File、包装类都重写了Object类中的equals（）方法，重写以后，比较的不是
  两个引用的地址值是否相同，而是比较两个对象的实体内容是否相同

5.通常情况下，我们自定义的类如果使用equals（）的话，通常是比较两个对象的实体内容是否相同，那么
  我们就需要对Object类中的equals（）方法进行重写
  重写的规则，比较实体的内容是否相同
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        char c = 10;
        System.out.println( i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true

        Person p1 = new Person("tom",20);

        Person p2 = new Person("tom",20);

        System.out.println(p1.equals(p2));//没重写之前false

        String str1 = new String("123");
        String str2 = new String("123");

        System.out.println(str1.equals(str2));//true

    }
}
