package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * 如果张浩的Java考试成绩大于90分，张浩就能获得一个MP4作为奖励
 * 
 */
public class IfDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("输入张浩的Java成绩: "); //提示要输入Java成绩
        int score1 =  input.nextInt(); 	     //从控制台获取Java成绩
        if ( score1 > 90 ) {    			 //判断是否大于90分
             System.out.println("老师说:不错，奖励一个MP4！");
        }
     
	}

}
