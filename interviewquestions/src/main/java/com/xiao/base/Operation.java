package com.xiao.base;

import java.util.Date;

public class Operation {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        test5();
    }

    private static void test1(){
        int k = 0;

        int ret = ++k + k++ + ++k + k;

        // ret的值为多少

        System.err.println(ret);
    }


    /*
    第一条中，都是相加，则从前到后的顺序运算，字符串与数字相加，连接为一个字符串，
    再与后面的数字相加，再次连接为字符串，因此结果为“i1 + i2 = 1010”。

    第二条编译错误，字符串无法与数字用减号连接。

    第三条、第四条中乘除的优先级高，会先运算，而后再与字符串连接，因此结果
    分别为：“i1 * i2 = 100”、“i1 * i2 = 1”。
     */
    private static void test2(){
        int i1 = 10, i2 = 10;

        System.err.println("i1 + i2 = " + i1 + i2);

        System.err.println("i1 - i2 = " + (i1 - i2));

        System.err.println("i1 * i2 = " + i1 * i2);

        System.err.println("i1 / i2 = " + i1 / i2);
    }

    public void myMethod(String str) {
        System.err.println("string");
    }

    public void myMethod(Object obj) {
        System.err.println("object");
    }

    public static void test3() {
        Operation t = new Operation();
        t.myMethod(null);
    }

    //这道题考察的是日期中获取的月份是从0开始的，因此会比我们日常的月份少1，9月8号 这个题答案是8 8。
    public static void test4(){
        Date date = new Date();

        System.err.println(date.getMonth() + " " + date.getDate());
    }

    /*
    这个是在考Math取整数的三种方法。round()是四舍五入取证，floor()是舍去小数位，ceil()是向上进一位。
    floor是地板ceil是天花板，一个在下，则舍去，一个在上，则向上进1。那是不是结果应该为12、11、12呢？
    还要考虑返回值类型，round()返回值类型为long长整型，floor()和ceil()返回值的是double类型，
    因此正确的答案应该是12、11.0、12.0。
     */
    public static void test5(){
        double val = 11.5;

        System.err.println(Math.round(val));

        System.err.println(Math.floor(val));

        System.err.println(Math.ceil(val));
    }
}
