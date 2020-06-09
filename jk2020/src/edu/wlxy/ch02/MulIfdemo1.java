package edu.wlxy.ch02;

/*
 *对学生的考试成绩评测
 *成绩>=80 ：良好 
 *成绩>=60 ：中等
 *成绩<60   ：差

 * 
 */
public class MulIfdemo1 {

	public static void main(String[] args) {
		int  score=75;
		if(score>=80){
			System.out.println("良");
		}
		else if(score>=60 && score<80){
			System.out.println("中");
		}
		else if(score<60){
			System.out.println("差");
		}
	}

}
