package edu.wlxy.ch01;

import java.util.Scanner;
//与c语言中的include类似，要导入库文件
public class DemoExec01 {

	public static void main(String[] args) {
		//实例化(创建)一个Scanner对象，相当于创建1个键盘
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入原始数据：");
		int date=sc.nextInt();//调用方法（函数），输入一个int型数据
		int result=0;
		result=(date*10+5)/2+(int)3.1415;
		System.out.println(date+"经过加密后，变成了"+result);
	}

}
