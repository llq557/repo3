package edu.wlxy.ch02;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//  快速注释的快捷键  ctrl+/
		double a,b,c;
		double p,q;
		double x1,x2;
				
		Scanner reader=new Scanner(System.in);
		System.out.println("a:");
		a=reader.nextDouble();//读一个浮点数
		System.out.println("b:");
		b=reader.nextDouble();
		System.out.println("c:");
		c=reader.nextDouble();

		p=-b/(2*a);
		q=Math.sqrt(b*b-4*a*c)/(2*a);
		
		x1=p+q;
		x2=p-q;
			
		System.out.println("x1="+x1);
		System.out.println("x2="+x2);
		
//       System.out.println(Math.max(45, 89));
//		System.out.println(Math.PI);
		

	}

}
