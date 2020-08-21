package com.javase.august19;
/*
类的成员之四：代码块（或初始化块）

由父及子静态先行

1.代码块的作用：用来初始化类、对象
2.代码块如果有修饰的话，只能使用static
3.分类：静态代码块和非静态代码块

4.静态代码块
        ①内部可以有输出语句
        ②随着类的加载而执行，且只执行一次
        ③作用：初始化类的信息
        ④如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
        ⑤静态代码块的执行要早于非静态代码块
        ⑥静态代码块只能调用静态的属性、静态的方法，不能调用非静态的结构

5.非静态代码块
        ①内部可以有输出语句
        ②随着对象的创建而执行
        ③每创建一个对象就执行一次非静态代码块
        ④作用：可以在创建对象时对对象的属性等进行初始化
        ⑤如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
        ⑥非静态的代码块既能调静态又能调非静态

6.对属性可以赋值的位置：
        ①默认初始化
        ②显式初始化
        ③构造器中初始化
        ④对象。属性或对象。方法
        ⑤代码块中初始化


 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;

        System.out.println("*************");

        Person person1 = new Person();
        Person person2 = new Person();

    }
}

class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //静态代码块
    static {
        System.out.println("hello,static block");
        desc = "我是爱学习的人";
    }
    //非静态代码块
    {
        System.out.println("hello,block");
        age = 1;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("我是快乐的人");
    }
}
