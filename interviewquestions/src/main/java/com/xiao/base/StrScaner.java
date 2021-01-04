package com.xiao.base;

import java.util.Scanner;

public class StrScaner {
    public static void main(String[] args) {
        System.out.println("请输入一行字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println("请输入一个字符");
        Scanner sc1 = new Scanner(System.in);
        char s = sc1.nextLine().toLowerCase().charAt(0);

        int count = getLength(str,s);
        System.out.println("含有该字符的个数:\t"+count);




    }
    public static int getLength(String str,char c) {
        int count = 0;
        if (str != null && str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (c == str.charAt(i)) {
                    count++;
                }
            }
        } else {
            count = 0;
        }
        return count;
    }
}
