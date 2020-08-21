package com.javase.august8;
//数组的冒泡排序
public class BubbleSortTest {
    public static void main(String[] args) {

        int[] arr = new int[]{55,66,80,38,-5,20};

        //冒泡排序
        for (int i = 0; i < arr.length;i++){
            for ( int j = 0; j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
