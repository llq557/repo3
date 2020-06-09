package edu.wlxy.ch01;

import java.util.Scanner;
//与c语言中的include类似，导入一些库函数。
/*
 * 演示 通过键盘输入各种类型的数据
 * 
 */



public class Demo5 {

	public static void main(String[] args) {
		// 实例化一个对象（创建一个键盘对象）
		Scanner  sc=new Scanner(System.in);
		System.out.println("请输入原始数据：");
     int data=sc.nextInt();
     int result=0;
     result=(int)((data*10+5)/2+3.14159);
     System.out.println(data+"经过加密后变成"+result);
     System.out.println("==================");
     System.out.println("请输入f1：");
     float  f1=sc.nextFloat();//调用方法（函数），输入一个float型数据
     System.out.println("请输入d1：");
     double  d1=sc.nextDouble();
     
     System.out.println("f1="+f1);
     System.out.println("d1="+d1);
     
     System.out.println("请输入字符串：");
     String  str=sc.next();
     System.out.println("str="+str);
     
     char ch1=str.charAt(0);//从字符串中获取指定位置的字符
     System.out.println("ch1="+ch1);
     
     char ch2=str.charAt(5);//从字符串中获取指定位置的字符
     System.out.println("ch2="+ch2);
	}

}
