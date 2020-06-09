package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * 如果张浩Java考试成绩大于98分，老师就奖励他一个MP4，
 * 否则老师就罚他进行编码
 */
public class IfDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>98){
			System.out.println("奖励一个MP4");
		}else{
			System.out.println("继续学习");
		}
		
	}

}
