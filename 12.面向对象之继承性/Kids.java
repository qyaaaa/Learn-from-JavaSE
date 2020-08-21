package com.javase.august15;

public class Kids extends ManKid{
    private int yearOld;

    public Kids(){

    }

    public Kids(int yearOld){
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("我" + yearOld + "岁了");
    }

    public int getYearOld(){
        return yearOld;
    }

    public void setYearOld(int yearOld){
        this.yearOld = yearOld;
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
