package edu.wlxy.ch08;

public class Demo {

	public static void main(String[] args) {
		String  x="abc";
		System.out.println(x.length());
		System.out.println("abc".length());
		
		Integer y=5;
		System.out.println(y.toString());
//		System.out.println(5.toString());  // 5是基本数据类型，不是类对象，没有方法
		Integer  z=new Integer(5);
		System.out.println(z.toString());
	}

}
