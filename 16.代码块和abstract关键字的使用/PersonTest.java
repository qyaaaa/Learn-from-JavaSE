package com.javase.august19;
/*
抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {

        method(new Student("123",122));//匿名对象

        Worker worker = new Worker();
        method1(worker);//非匿名的类非匿名的对象

        method1(new Worker());//非匿名的类匿名的对象

        System.out.println("************");
        //创建了一匿名子类的对象：person1
        Person1 person1 = new Person1() {
            @Override
            public void sleep() {
                System.out.println("好好睡觉");
            }
        };

        method1(person1);
    }

    public static void method1(Person1 person1){

        person1.sleep();
    }

    public static void method(Student s){
        
    }
}
class Worker extends Person1{
    @Override
    public void sleep( ){
        System.out.println("睡觉");
    }
}
