package edu.wlxy.ch10;

import java.io.*;

public class FileInputStreamdemo1 {

	public static void main(String[] args) {
		File  file=new File("reader.txt");
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			int temp=0;

			while((temp=fin.read())!=-1){
				System.out.print((char)temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
			

	}

}
