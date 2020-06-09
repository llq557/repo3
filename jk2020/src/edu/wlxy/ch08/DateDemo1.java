package edu.wlxy.ch08;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.*;


public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date1=new Date();
System.out.println(date1);
System.out.println(date1.getTime());//当前日期距离1970/1/1 0时 多少毫秒
//有些方法上有横线，表示该方法过时了，不推荐使用，建议使用其它的类或方法来代替。继续使用不影响效果，为了向下兼容。
//getMonth()  月份  从0开始计算
//getDate()   天数  从1开始计算
System.out.println(date1.getYear());//  2020-1900
System.out.println("月份："+date1.getMonth());
System.out.println("天数："+date1.getDate());
System.out.println("-------111--------");
SimpleDateFormat sf1=new SimpleDateFormat();
System.out.println(sf1.format(date1));
SimpleDateFormat sf2=new SimpleDateFormat("yyyy年M月dd日  EEE");
System.out.println(sf2.format(date1));
System.out.println("-------222--------");
Calendar ca=new GregorianCalendar();
System.out.println(ca.get(Calendar.YEAR));
System.out.println("月份"+ca.get(Calendar.MONTH));
System.out.println(ca.get(Calendar.DATE));

Clock  cl= Clock.systemUTC();
System.out.println(cl.instant());

	}

}
