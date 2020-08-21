package com.javase.august8;

/*
定义一个int型的一维数组，包含10个元素，分别赋值，求最大最小值，和值，平均值
[10,99]
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }

        //遍历
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        //最大值
        int maxVaule = arr[0];
        for(int i = 1;i < arr.length;i++) {
            if (maxVaule < arr[i]) {
                maxVaule = arr[i];
            }

        }
        System.out.println("最大值为" + maxVaule);

        //最小值
        int minVaule = arr[0];
        for(int i = 1;i < arr.length;i++) {
            if (minVaule > arr[i]) {
                minVaule = arr[i];
            }

        }
        System.out.println("最小值为" + minVaule);

        //和值
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            sum += arr[i];
        }
        System.out.println(sum);


        //平均值
        double ave = 0;
        ave = sum / 10;
        System.out.println(ave);




    }
}
