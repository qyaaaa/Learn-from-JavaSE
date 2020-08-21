package com.javase.august19;

public class Manger extends Employee {
    private double bonus;//奖金

    public Manger(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("管理员工，提高公司运行效率");
    }
}
