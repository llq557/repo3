package edu.wlxy.ch02;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class WhileDemo2 {
/*
 *  你去朋友家聚餐。在餐桌上，朋友问你：喝可乐吗？如果不喝，就不拿可乐；如果喝，上一瓶可乐。


 */
	public static void main(String[] args) {
		// new Scanner(System.in)相当于创建了一个键盘
		Scanner sc=new Scanner(System.in); //sc是键盘的名称
		int count=0;//统计喝了多少瓶可乐
		
//		System.out.println("朋友问：你喝可乐吗？");
//		boolean  f=sc.nextBoolean();//用f 来标记  回答是否喝可乐。  true:表示喝  。     false：表示不喝
//		while(f==true){
//			System.out.println("上一瓶可乐。");
//			count++;
//			System.out.println("朋友问：你还喝吗？");
//			f=sc.nextBoolean();
//		}
		
		
		System.out.println("朋友问：你喝可乐吗？");
		String  f=sc.next();//用f 来标记  回答是否喝可乐。  喝    或 不喝
		while(f.equals("喝")){
			System.out.println("上一瓶可乐。");
			count++;
			System.out.println("朋友问：你还喝吗？");
			f=sc.next();
		}
		
		
		//利用if  else  处理输出的结果，更加符合我们的说话习惯。
		if(count==0){
			System.out.println("没有喝可乐。");
		}else{
			System.out.println("喝了"+count+"瓶可乐。");
		}
		
	}

}
