package com.javase.august17;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if (obj instanceof Person){
            Person p1 = (Person)obj;
            //比较两个对象的每个属性是否相同
            if(this.age == p1.age && this.name.equals(p1.name)){
                return true;
            }else {
                return false;
            }


        }

        return false;

    }

    public String toString(){
        return "Person[ name = " + name + ", age = " + age + "]";
    }
}
