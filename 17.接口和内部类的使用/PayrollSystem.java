package com.javase.august20;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        //方法一
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int month = scanner.nextInt();

        //方法二
        Calendar calendar = Calendar.getInstance();
        int month1 = calendar.get(Calendar.MONTH);//一月份为0

        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("马云",1002,new MyDate(1992,2,28),10000);


        employees[1] = new HourlyEmployee("麻花疼",1003,new MyDate(1990,2,10),60,240);


        for (int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为" + salary);

            if(month == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}
