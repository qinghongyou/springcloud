package com.xiao;

import java.util.Calendar;
import java.util.Date;

public class MainTest2 {

    public static void main(String[] args) {
        int hour = 21;
        int count = 1200;
        boolean flagCount = count>1000;
        if(flagCount && ((hour>=9 && hour<=12) || (hour>=14 && hour<=22))){
            System.out.println("true ...");
        } else {
            System.out.println("false ...");
        }

        System.out.println("------------------------");
        Calendar c = Calendar.getInstance();//可以对每个bai时间域单独修改du
        Date date = new Date();
        System.out.println("new Date :" + date);

        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) - 1);
        Date dateAfter = c.getTime();
        System.out.println("1 hour after :" + dateAfter);
    }
}
