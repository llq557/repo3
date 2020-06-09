package edu.wlxy.ch02;

public class WhileExec1 {
/*
 * 2019年学院有学生0.8万人，每年增长15%。
 * 请问按此增长速度，到哪一年学生人数将达到1.3万人？

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int  year=2019;
   int stuCount=8000;
   while(stuCount<=13000){
	  stuCount=(int) (stuCount*(1+0.15));
	  year++;
	  System.out.println(year+"年，有"+stuCount+"名学生。");
   }
		
	System.out.println(year);	
		
	}

}
