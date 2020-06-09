package edu.wlxy.ch07;

import java.util.InputMismatchException;
import java.util.*;


public class Testdemo1 {

	public static void main(String[] args) {
		try{
		Scanner in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1 = in.nextInt();
		System.out.print("请输入除数:");
		int num2 = in.nextInt();
		System.out.println(String.format("%d / %d = %d", 
						num1, num2, num1/ num2));
		int[]  a={1,2,3,4,5};
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
		
		
		System.out.println("感谢使用本程序！");
		}catch(ArithmeticException e){
			System.out.println("除数不能是0");
//			e.printStackTrace();
		}catch(InputMismatchException e){
			System.out.println("被除数和除数必须是整数");
//			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组下标越界");
//			e.printStackTrace();
		}catch(Exception e){
			System.out.println("其他异常情况");
//			e.printStackTrace();
		}finally{
			System.out.println("本程序已经运行结束。");
		}
	}

}
