package edu.wlxy.ch10;

import java.io.*;

public class FileInputStreamdemo3 {

	public static void main(String[] args) throws Exception {
		// 1 
		File file=new File("reader.txt");
//		 2
		FileInputStream fin=new FileInputStream(file);
//		3
		int temp;
		/*
		while(true){
			temp=fin.read();
			if(temp==-1) break;
			System.out.print((char)temp);
		}
		*/
		//经典写法，一定要掌握，后面其他类的输入与这个程序 都是类似的。
		while((temp=fin.read())!=-1){
			System.out.print((char)temp);
		}
		
//4
        fin.close();
	}

}
