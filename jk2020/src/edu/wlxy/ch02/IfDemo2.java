package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * 张浩的Java成绩大于98分，而且音乐成绩大于80分，老师会奖励他；
 * 或者Java成绩等于100分，而且音乐成绩大于70分，老师也会奖励他
 */
public class IfDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("输入张浩的Java成绩: "); //提示要输入Java成绩
        int score1 =  input.nextInt(); 	     //从控制台获取Java成绩
        System.out.print("输入张浩的音乐成绩: "); 
        int score2 =  input.nextInt(); 	     
        if ( (score1 > 98 && score2>80)  ||   (score1 == 100 && score2>70)) {    			 //判断是否大于90分
             System.out.println("老师说:不错，奖励一个MP4！");
        }
		
	}

}
