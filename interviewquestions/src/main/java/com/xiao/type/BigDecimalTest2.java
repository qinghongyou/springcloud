package com.xiao.type;

import java.math.BigDecimal;

public class BigDecimalTest2 {

    public static void main(String[] args) {
        double d1 = 0.01;
        double d2 = 0.05;
        BigDecimal b9 = BigDecimal.valueOf(d1);
        BigDecimal b10 = BigDecimal.valueOf(d2);
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("b9: " + b9);
        System.out.println("b10: " + b10);
        System.out.println("b9.add(b10): " + b9.add(b10));
    }

}
