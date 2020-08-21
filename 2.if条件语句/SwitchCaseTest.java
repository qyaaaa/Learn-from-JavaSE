package com.javase.august4;

public class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 5;//byte,short,char,int,String,枚举,其他类型不可使用
        switch (number){//依次匹配各个case，匹配成功进入结构并不退出，而是依次执行。
            case 0://只能判断==
                System.out.println("zero");
                break;//执行之后跳出switch-case，break是可选的
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default://default是可选的，位置是灵活的
                System.out.println("other");
        }
    }
}
