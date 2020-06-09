package edu.wlxy.ch04;

import java.util.Scanner;

/*
 * 本例演示了多个类在1个文件中定义的情况。
 * 1：若完成某个功能，涉及到多个类（例如3个类）。
   这些类（例如3个类）可以写在同一个程序中保存为一个java文件，也可以分散写成多个独立的类（例如3个类）保存为3个文件。
2：若多个类写在同一个程序文件中，要求：以哪个类为主？文件名如何命名？ 修饰符是否有要求？
       同一个文件中不允许出现多个pubic修饰的类。
   文件名与 public 类的 类名保持一致。
      文件名：哪个类中包含main，就必须以哪个类为文件名。
       main方法所在的类必须 在类名称前 用 public 修饰。
3：建议：先分散写，一个类写成一个文件。
      若某个功能实现，只需要1个类，则可以将main方法写在该类中。

 */

 class Studentdemo{
String  name;
int age;
String classname;
String hobby;

public  void printInfo(){
System.out.println(name);	
System.out.println("年龄："+age);	
System.out.println("班级："+classname);	
System.out.println("爱好："+hobby);	
}


}

public class Teacherdemo{
	String tchname;
	int  tchage;
	
	public void printTchInfo(){
		System.out.println(tchname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Studentdemo st1=new Studentdemo();
  st1.printInfo();//st1都没有赋值，所有使用默认值
  
  
  Studentdemo st2=new Studentdemo();
  st2.name="张飞1";
  st2.age=19;
  st2.classname="计算机2班";
  st2.hobby="吃鸡";
  st2.printInfo();
  
  Teacherdemo  t1=new Teacherdemo();
  t1.tchname="刘备1";
  t1.printTchInfo();
  
  int i=0;
	Studentdemo [] sst=new Studentdemo[3];
	
	Scanner  sc=new Scanner(System.in);
	for(i=0;i<3;i++){
		sst[i]=new Studentdemo();
		System.out.println("请输入姓名：");
		sst[i].name=sc.next();
	}
	
      sst[1].printInfo();
	}
	
}

