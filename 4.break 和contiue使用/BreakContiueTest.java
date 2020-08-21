package com.javase.august6;
/*
break:    switch-case   结束当前循环
          循环结构中
contiue：  循环结构      结束当次循环
 */
public class BreakContiueTest {
    public static void main(String[] args) {
        for(int i = 1;i <= 10;i++){
            if(i % 4 == 0){
                //break;//123
                continue;//1235679 10
                //皆不可加其他语句
            }
            System.out.println(i);
        }

        System.out.println();

        label:for(int m = 1;m <= 4;m++){
            for(int n = 1;n <= 10;n++){
                if(n % 4 == 0){
                    break label;//加标签即可结束外层循环
                    //break;
                    //continue label;
                }
                System.out.print(n);
            }
        }
    }
}
