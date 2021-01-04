package com.xiao.base;

public class NumTest {
    public static void main(String[] args) {

        Integer i1 = 127;

        Integer i2 = 127;

        System.err.println(i1 == i2);

        i1 = 128;

        i2 = 128;

        System.err.println(i1 == i2);

    }
}
