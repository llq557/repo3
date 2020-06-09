package edu.wlxy.ch03;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String  str1="a123.ja";
  String str2="你好。";
  int  x=str1.lastIndexOf('.');
  System.out.println(str1.charAt(5));
 String  str3=str1.substring(x);//从指定位置开始截取字符，到末尾结束
  System.out.println(str1.substring(3,4));//从指定位置开始截取字符，到指定位置前一个结束
	if(str3.equals(".java")){
		System.out.println("yy");
	}else{
		System.out.println("nn");
	}
	
	}

}
