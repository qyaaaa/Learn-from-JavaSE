package com.javase.august21;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.regist(1001);
        System.out.println(student);
        System.out.println("***********");
        student.regist(-1);
        System.out.println(student);
    }
}

class Student{
    private int id;

    public void regist(int id){
        if(id > 0){
            this.id = id;
        }else {
            //手动的抛出一个异常
            throw new RuntimeException("输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
