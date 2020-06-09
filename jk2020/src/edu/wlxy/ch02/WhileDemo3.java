package edu.wlxy.ch02;

import java.util.Scanner;

public class WhileDemo3 {
	/*
	 * 如何使用while循环
	 * 老师每天检查张浩的学习任务是否合格。如果不合格，则继续进行。
                老师给张浩安排的每天的学习任务为：上午阅读教材，学习理论部分，下午上机编程，掌握代码部分

	 */
	public static void main(String[] args) {
		String answer;	//标识是否合格
		Scanner input = new Scanner(System.in);
		System.out.print("合格了吗?(y/n)：");
		answer = input.next();
		
		while(!"y".equals(answer)){
			System.out.println("上午阅读教材！");
			System.out.println("下午上机编程！\n");
			System.out.print("合格了吗?(y/n)：");
			answer = input.next();
		}
		System.out.println("完成学习任务！");
	}


}
