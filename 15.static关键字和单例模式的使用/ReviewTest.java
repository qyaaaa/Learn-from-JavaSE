package com.javase.august18;

public class ReviewTest {

    public static void main(String[] args) {
        ReviewTest reviewTest = new ReviewTest();
        reviewTest.test();

    }

    public void test(){
        int[] arr = new int[3];
        print(arr);
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getSuperclass());

    }

    public void print(Object object){
        System.out.println(object);
    }
}
