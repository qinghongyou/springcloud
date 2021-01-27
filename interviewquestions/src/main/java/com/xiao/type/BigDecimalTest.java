package com.xiao.type;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        String s1 = "0.01";
        String s2 = "0.05";
        BigDecimal b13 = new BigDecimal(s1);
        BigDecimal b14 = new BigDecimal(s2);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("b13: " + b13);
        System.out.println("b14: " + b14);
        System.out.println("b13.add(b14): " + b13.add(b14));
    }

}
