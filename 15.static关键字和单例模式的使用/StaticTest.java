package com.javase.august18;
/*
static关键字的使用：
1.static静态的
2.用来修饰属性、方法、代码块、内部类

3.使用static修饰属性:静态变量
        3.1属性：按是否使用static修饰分为：静态变量和非静态变量（实例变量）
        ①实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性，
        当修改其中一个对象的非静态属性时，不会导致其他对象中同样的属性值的修改。
        ②静态变量：我们创建了类的多个对象，多个对象共享一个静态变量，当通过一个对象修
        改静态变量时，其他对象调用此变量是修改过的。
        3.2static修饰属性的其他说明：
        ①静态变量是随着类的加载而加载,可以通过类。静态变量的方式调用
        ②静态变量的加载要早于对象的创建
        ③由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
        ④       类变量         实例变量
        类        yes             no
        对象      yes             yes
        3.3静态属性举例System。out；Math。PI

4.使用static修饰方法：静态方法
        ①随着类的加载而加载，可以通过类。静态方法来调用
        ②       静态方法         非静态方法
        类        yes             no
        对象      yes             yes
        ③静态方法中只能调用静态的方法或属性，非静态方法及可以调用非静态的方法和属性，也可以调用静态的方法和属性

5、static注意点：
        在静态的方法内，不能使用this关键字，super关键字

6.开发中，如何确定一个属性是否要声明为static
    ①属性可以被多个对象所共享的，不会随着对象的不同而不同的。
    ②类中的常量也常常声明为static

7.开发中，如何确定一个方法是否要声明为static
    ①操作静态属性的方法，通常设置为static的
    ②工具类中的方法，习惯声明为static的。比如：Math、Arrays、Collections

 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "zg";
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.age = 40;
        c1.name = "姚明";
        c1.nation = "china";

        Chinese c2 = new Chinese();
        c2.age = 30;
        c2.name = "马龙";
        System.out.println(c2.nation);
        c2.eat();
    }
}

class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("吃");
    }

    public static void show(){
        System.out.println("我是中国人");
        System.out.println(Chinese.nation);
        System.out.println(nation);//省略的是类.
    }

}
