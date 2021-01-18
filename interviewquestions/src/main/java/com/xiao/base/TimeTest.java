package com.xiao.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
	
	public static void main(String[] args) {
		String time830 = " 08:30:00";
		String time930 = " 09:30:00";
		String time1400 = " 14:00:00";
		String time1500 = " 15:00:00";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
	    String strDate = sdf1.format(date);
	    String strDateTime830 = strDate + time830;
	    String strDateTime930 = strDate + time930;
	    String strDateTime1400 = strDate + time1400;
	    String strDateTime1500 = strDate + time1500;
	    System.out.println("strDateTime830:"+strDateTime830);
	    System.out.println("strDateTime930:"+strDateTime930);
	    System.out.println("strDateTime1400:"+strDateTime1400);
	    System.out.println("strDateTime1500:"+strDateTime1500);
	    System.out.println("*****************************************");
	    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date830=null;
	    Date date930=null;
	    Date date1400=null;
	    Date date1500=null;
		try {
			date830 = sdf2.parse(strDateTime830);
			date930 = sdf2.parse(strDateTime930);
			date1400 = sdf2.parse(strDateTime1400);
			date1500 = sdf2.parse(strDateTime1500);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("date:"+date);
	    System.out.println("date830:"+date830);
	    System.out.println("date930:"+date930);
	    System.out.println("date1400:"+date1400);
	    System.out.println("date1500:"+date1500);
	    boolean amFlag = date.after(date830) && date.before(date930);
	    boolean pmFlag = date.after(date1400) && date.before(date1500);
	    int count = 3000;
	    boolean flag = count >2000;
	    System.out.println("amFlag: "+ amFlag +"    pmFlag: " + pmFlag + "    flag: " + flag);
	    if((flag && amFlag) || (flag && pmFlag)){
	    	System.out.println("date.after(date830) && date.before(date930) && count>2000");
	    } else {
	    	System.out.println("else......");
	    }
	
	}

}
