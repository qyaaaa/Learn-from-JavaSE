package com.javase.august13;
/*
this关键字的使用:
1.this可以用来修饰：属性，方法，构造器

2.this修饰属性和方法
    this理解为当前对象

    在类的方法和构造器中：
    通常情况下省略this，特殊情况下，如果方法的形参和类的属性同名时，
    我们必须显示的使用this。变量的方式，表明此变量是属性，而非形参

3.this调用构造器:
    ①在类的构造器中，我们可以用this（形参列表）调用其他的构造器，调用本类中的其他构造器
    ②无法调用自己
    ③如果一个类中有n个构造器，最多有n-1个能调用
    ④规定this（形参列表）必须声明在当前构造器的首行
    ⑤构造器内部，最多只能声明一个this（形参列表）来调用其他的构造器
 */
public class ThisTest {
    public static void main(String[] args) {
        This1 t = new This1();
        t.setAge(10);
        System.out.println(t.getAge());

        t.eat();

        System.out.println();

        This1 t2 = new This1("tom",20);

        System.out.println(t2.getAge() + "," + t2.getName());


    }
}
class This1{
    private String name;
    private int age;

    public This1(){
        this.eat();
        String info = "********************";
        System.out.println(info);

    }

    public This1(String name){
        this();
        this.name = name;
    }

    public This1(int age){
        this();
        this.age = age;
    }

    public This1(String name,int age){
        this(name);
        //this.name = name;
        this.age = age;
    }



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }

    public void study(){
        System.out.println("人学习");
    }
}
