package com.javase.august15;

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setYearOld(20);
        someKid.printAge();

        someKid.setSex(1);
        someKid.setSalary(1);
        someKid.employeed();
    }
}
