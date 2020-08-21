package com.javase.august8;
//地址值相同
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        for(int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        //赋值非复制
        arr2 = arr1;
        for (int i = 0; i < arr2.length;i++){
            if (i % 2 == 0){
                arr2[i] = i;
            }
        }
        System.out.println();

        for(int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        }
}
