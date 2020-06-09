package edu.wlxy.ch04;
//与c语言中的结构体 类似
public class School {
String sname;
int scnumber;
int slabnumber;

public void showInfo(){
	System.out.println(sname+"---"+scnumber);
}

//程序员自己定义1个带参数的构造方法
public School(String sname) {
	this.sname = sname;
}
//当程序员自己定义带参数的构造方法后，默认构造方法还存在吗？
//默认的构造方法
public School() {
	
}



}
