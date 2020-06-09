package edu.wlxy.ch03;


/*
 * 主要演示 equals  与   ==  的区别
 * 通过debug模式，观察变量的id
 * equals 比较字面上的内容是否相同
 * ==     比较存储的位置是否相同
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Java";
		   String s2 = new String("Java");
		   if (s1 == s2)
		     System.out.println("s1 == s2");
		   else
		     System.out.println("s1 != s2");
         

	}

}
