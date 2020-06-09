package edu.wlxy.ch10;

import java.io.*;

public class FileWriterdemo {

	public static void main(String[] args) throws Exception {
		FileWriter  fout=new FileWriter("jk5191.txt", true);
		String  str="今晚吃鸡";
		
//		方法1 
		fout.write(str);
//		方法2  不适合中文
//		for(int i=0;i<temp.length;i++){
//			fout.write(temp[i]);
//		}
		
		fout.close();
		System.out.println("程序运行完毕");

	}

}
