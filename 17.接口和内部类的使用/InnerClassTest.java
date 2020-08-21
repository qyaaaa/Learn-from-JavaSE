package com.javase.august20;
/*
类的内部成员之五：内部类
1.java中允许将一个类A中声明在另一个类B中，则类A1就是内部类，类B为外部类

2.内部类的分类：成员内部类   局部内部类（方法内、代码块内、构造器内）

3.成员内部类:
        一方面：作为外部类的成员：
                    ①调用外部类的结构
                    ②可以用static修饰
                    ③可以被四种不同的权限修饰

        另一方面：作为一个类：
                    ①类内可以定义属性、方法、构造器
                    ②可以被final修饰，表示此类不能被继承，言外之意不使用final就可以被继承
                    ③可以被abstract修饰，不可以实例化

4.关注如下的三个问题
        4.1如何实例化成员内部类的对象
        4.2如何在成员内部类中区分调用外部类的结构
        4.3开发中局部内部类的使用
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例（静态的成员内部类）：
        Person.Dog dog = new Person.Dog();

        System.out.println("********************");

        //创建Bird实例（非静态的成员内部类）
        Person person = new Person();
        Person.bird bird = person.new bird();
        bird.display("123");
    }
}

class Person{

    String name = "小马";
    int age;


    public void show(){
        System.out.println("卡拉是条狗");
    }

    public static void eat(){

    }

    //静态成员内部类
    static class Dog{


    }

    //非静态成员内部类
    class bird{
        String name = "杜鹃";


        public bird(){
            Person.this.eat();//调用外部类的非静态属性

            show();
        }

        public void sing(){
            System.out.println("唱歌");
        }

        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }

    }

    public Person(){
        //局部内部类
        class CC{

        }
    }

    public void method(){
        //局部内部类
        class AA {

        }
    }

    {
        //局部内部类
        class BB{

        }
    }
}
