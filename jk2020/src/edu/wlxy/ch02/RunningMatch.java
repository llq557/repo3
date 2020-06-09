package edu.wlxy.ch02;

import java.util.*;
public class RunningMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入比赛成绩（s）：");
	double score = sc.nextDouble();
		System.out.print("请输入性别：");
		String gender = sc.next();
		if(score<=10){
//			System.out.println("进入决赛");
			if(gender.equals("男")){  // 字符串比较是否相等，使用equals()  ,不能使用==
				System.out.println("进入男子组决赛！");
			}else {
				System.out.println("进入女子组决赛！");
			}
			
		}else{
			System.out.println("淘汰！");
		}
		
		
		
		
		
	}
}
