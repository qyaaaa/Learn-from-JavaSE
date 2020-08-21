package com.javase.august13;
//在personTest类中实例化Person类的对象b，调用setAge（）和getAge（）方法，体会java封装性
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(50);

        int i = person.getAge();
        System.out.println(i);

        Person p2 = new Person("tom",20);
        System.out.println("姓名为" + p2.getName());
    }
}
