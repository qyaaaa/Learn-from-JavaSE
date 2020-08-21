package com.javase.august16;
//多态性的使用
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{

    public void eat(){
        System.out.println("动物，吃");
    }

    public void shout(){
        System.out.println("动物，叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}
