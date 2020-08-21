package com.javase.august20;

public class SalariedEmployee extends Employee{

    private  double monthlySalary;//月工资

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }
    public double earnings(){
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                '}';
    }
}
