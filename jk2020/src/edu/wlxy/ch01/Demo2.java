package edu.wlxy.ch01;
/*
 * 演示数据定义、算术运算
 * 
 */
public class Demo2 {

	public static void main(String[] args) {
      double a=12.45;
	  float b=12.46f;
	  double c=200;//(涉及自动类型转换  int---> double)
	  float d=100;
	  String  name="张飞";
	  char  sex='男';
	  String sex2="男";
	  System.out.println("name的值是："+name);// 此处 + 表示连接
		System.out.println("-------------------");
		int n1=5;
		int n2=2;
		int n5=-2;
		double  n3=5.2;
		float n4=5;
		
		//在+ - * / 运算中，若参与运算的2个数都是int,则结果也是int
		//在+ - * / 运算中，若参与运算的2个数，只要有一个是小数（double,float）,则结果也是小数。
		System.out.println(n1/n2);
		System.out.println(n3+n2);
		System.out.println(n4/n2);
		System.out.println("------%%%%%%%%------");
		// % 求余数 。 在c语言中要求参与%运算的都是int，但是java没有这个要求
		//  求余数的正负问题： 和%前面的数的正负保持一致样
		System.out.println(n1%n2);
		System.out.println(n1%n5);
		
		System.out.println(-5%n2);
		System.out.println(-5%n5);
		System.out.println("-----++++++++-------");
		// ++   --  变量自己+1   或者 -1
		// ++  --  在变量前 或变量后，运算的先后不相同，很容易造成错误。
		// 我们尽量不在表达式中使用++  --
		n1++;
		n2--;
		System.out.println(n1++);
		System.out.println(n2);
		
		//单击出错的标记，会给出改错的建议
		double  x1=45.8;
		System.out.println(x1);
		
	}

}
