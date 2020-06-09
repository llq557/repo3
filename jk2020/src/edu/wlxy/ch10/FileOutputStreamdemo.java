package edu.wlxy.ch10;

import java.io.*;

public class FileOutputStreamdemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream  fout=new FileOutputStream("jk5191.txt",true);
		String  str=" 共同抗疫";
		byte[] temp=str.getBytes();
//		方法1 
//		fout.write(temp);
//		方法2
		for(int i=0;i<temp.length;i++){
			fout.write(temp[i]);
		}
		
		fout.close();
		System.out.println("程序运行完毕");

	}

}
