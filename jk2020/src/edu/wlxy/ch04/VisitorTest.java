package edu.wlxy.ch04;

import java.util.Scanner;

public class VisitorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Visitor v = new Visitor();		
		System.out.print("请输入姓名：");
		v.name = input.next();			
		System.out.print("请输入年龄：");
		v.age = input.nextInt();		
		v.show();                       
	}

}
