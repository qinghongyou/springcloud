package com.xiao.base;

import java.util.Calendar;
import java.util.Date;

public class StringTest {

    public static void main(String[] args) {
        String urlParams= "oauth=ekp&fdMobileType=mobiledingding";
        System.out.println(urlParams.indexOf("mobiledingding")>-1);
        boolean flagCount = 100>1000;
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);//得到当前时间的小时数
        if(flagCount && (hour>=8 && hour<=23)){
            System.out.println("flagCount && (hour>=8 && hour<=23)");
        }else{
            System.out.println("else...");
        }
        System.out.println(hour);
    }
}
