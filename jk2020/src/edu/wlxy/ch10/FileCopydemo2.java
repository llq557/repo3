package edu.wlxy.ch10;

import java.io.*;

public class FileCopydemo2 {

	public static void main(String[] args) throws Exception {
		FileReader fin=new FileReader("jk5191.txt");
		FileWriter  fout=new FileWriter("jk5192.txt");
		BufferedReader br=new BufferedReader(fin);
		BufferedWriter bw=new BufferedWriter(fout);
		String temp=null;
		
		while((temp=br.readLine())!=null){
			bw.write(temp);
			bw.newLine();//相当于 换行操作
		}
		bw.close();
		br.close();
		fin.close();
		fout.close();
  System.out.println("完毕");

	}

}
