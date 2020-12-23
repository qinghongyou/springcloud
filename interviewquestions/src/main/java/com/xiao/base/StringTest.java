package com.xiao.base;

public class StringTest {

    public static void main(String[] args) {
        String urlParams= "oauth=ekp&fdMobileType=mobiledingding";
        System.out.println(urlParams.indexOf("mobiledingding")>-1);
    }
}
