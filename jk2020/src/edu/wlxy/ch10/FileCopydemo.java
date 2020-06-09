package edu.wlxy.ch10;

import java.io.*;

public class FileCopydemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("source\\五环之歌.mp3"); //  转义字符"\\"
		FileOutputStream fout=new FileOutputStream("歌.mp3");
		int temp=0;
		long begintime = System.currentTimeMillis();
		while((temp=fin.read())!=-1){
			fout.write(temp);
		}
		long endtime = System.currentTimeMillis();
		System.out.println("拷贝文件所消耗的时间是：" + (endtime - begintime) + "毫秒");
		fout.close();
		fin.close();
		System.out.println("ok");
		
	}

}
