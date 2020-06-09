package edu.wlxy.ch10;

import java.io.*;

public class FileReaderdemo {

	public static void main(String[] args) throws Exception {
		File  file=new File("reader.txt");
		FileReader fin=new FileReader(file);
		int temp=0;
		
		while((temp=fin.read())!=-1){
			System.out.print((char)temp);
		}
		fin.close();
  System.out.println("Íê±Ï");
	}

}
