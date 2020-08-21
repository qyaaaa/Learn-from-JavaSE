package com.javase.august19;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee manger = new Manger("库克",1001,5000,50000);
        manger.work();
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

    }
}
