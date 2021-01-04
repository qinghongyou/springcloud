package com.xiao.base;

import java.util.Scanner;

public class StrLastLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        int length = word.length;
        int len = word[length - 1].length();
        System.out.println(len);
    }

}
