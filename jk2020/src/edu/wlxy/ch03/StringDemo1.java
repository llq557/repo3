package edu.wlxy.ch03;


import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	String uname,pwd;
    	System.out.print("请输入用户名： ");
    	uname=input.next();
    	System.out.println(uname.toLowerCase());
    	System.out.print("请输入密码： ");
    	pwd=input.next();
    	if( uname.equalsIgnoreCase("Tom") ){
        	System.out.print("成功！ ");
   	 }else{
        	System.out.print("失败");
    	}		


	}

}
