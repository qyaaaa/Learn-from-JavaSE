package com.javase.august13;

public class BoyGirlTest {
    public static void main(String[] args) {

        ThisBoy boy = new ThisBoy();
        boy.setName("罗密欧");
        boy.setAge(25);
        boy.shout();


        ThisGirl girl = new ThisGirl();
        girl.setName("朱丽叶");
        girl.setAge(25);

        boy.marry(girl);
        girl.marry(boy);
    }
}
