package com.javase.august8;

import java.util.Arrays;

//Arrays的工具类
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{4,3,1,2};


        //1、boolean equals(int[]a,int[]b) 判断两个数组是否相等的工具类
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2、String toString(int[]a) 输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3、void fill(int[]a,int[]b) 将指定的值填到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4、void sort(int[]a) 对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5、int binarySSearch(int[] a,int key) 查找位置
        int[] arr3 = new int[]{-50,-20,-15,2,10,50,80,99};
        int index =Arrays.binarySearch(arr3,10);
        if(index >= 0){
            System.out.println("位置为" + index);
        }else {
            System.out.println("没找到");
        }

    }

}
