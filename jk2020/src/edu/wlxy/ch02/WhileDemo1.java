package edu.wlxy.ch02;

public class WhileDemo1 {
/*
 * 输出5遍“好好学习，天天向上！”

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i < 1){
			System.out.println("第" +i+ "遍写：好好学习");
			i=i+1;
		}
		
		System.out.println("--------------");
		
		int j=1;
		do{
			System.out.println("第" +j+ "遍写：天天向上");
			j=j+1;
		}while(j < 1);
	}
	
}
