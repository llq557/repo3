package edu.wlxy.ch02;

import java.util.Scanner;

public class ForDemo2 {
	/*
	 * 循环输入某同学第1学期考试的5门课成绩，并计算平均分
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		String  name=sc.next();
	    int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"门课程成绩");
			int  score=sc.nextInt();
			
			sum=sum+score;
			
		}
		
		//System.out.println(name+"的平均分是"+sum/5.0);
		
		
	}

}
