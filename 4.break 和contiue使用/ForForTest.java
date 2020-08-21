package com.javase.august6;

//嵌套循环
public class ForForTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 6;i++){
            System.out.print("*");
        }
        System.out.println();
        //外层循环控制行数，内层循环控制列数
        for(int j = 1; j <= 4;j++){//外层循环
            for(int i = 1; i <= 6;i++){//内层循环
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        *
        **
        ***
        ****
        *****
         */
        for(int m = 1; m <= 5;m++){
            for(int n = 1; n <= m;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
