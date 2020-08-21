package com.javase.august14;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Date;

/*
package关键字的使用:
1.为了更好实现项目中类的管理，提供包的概念
2.使用package声明类或接口所属的包，声明在在首行
3.包属于标识符，应遵守标识符的命名规则，规范
4.每点一次代表一层文件目录

import关键字的使用
1.在源文件中显示的使用import结构导入指定包下的结构
2.声明在包和类之间
3.导入多个包结构时，并列写出即可
4.xxx。*的方式表示导入xxx包下的所有结构
5.如果使用的类或接口在lang包下则可省略
6.本包下类或接口的也可省略
7.如果在源文件中，使用了不同包下相同的类，则需要全类名显示
8.使用xxx。*方式表明可以调用xxx包下的的所有结构，
 但是如果使用的是xxx子包下的结构，则仍需要导包
9.import static：导入指定类或接口的静态结构
 */
public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3});
        int[] i = new int[]{1,5,9};
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(5464646546465l);

        out.println();
    }
}
