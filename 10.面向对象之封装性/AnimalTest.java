package com.javase.august13;
/*
一、面向对象的特征一：封装与隐藏
问题的引入：
    实际问题需要加入限制条件，所以只能通过方法进行条件的制约，
    同时需要避免使用“对象。属性”对属性进行赋值

二、封装性的体现：
①将类的属性私有化，同时提供公共的（public）的方法来获取setLegs和getLegs的值
②不对外暴露的私有方法
③单例模式

三、封装性的体现需要权限修饰符
1.四种权限：private、缺省、protected、public（从小到大）
2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
    修饰类的话只能用缺省、public

封装性的总结：java提供了四种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性大小

 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal test = new Animal();
        test.name = "阿花";
        //test.age = 5;
        //test.legs = -5;

        test.setLegs(-5);

        test.show();
    }
}
class Animal{
    String name;
    private int age;
    private int legs;//腿的个数

    public void setLegs(int i){
        if(legs > 0 && legs % 2 == 0){
            legs = i;
        }else {
            legs = 0;
        }
    }

    //对属性的获取
    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name = " + name + ", age =" + age + ", legs = " + legs);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int i){
        if(age > 0){
            age = i;
        }else {
            age = -1;
        }
    }
}
