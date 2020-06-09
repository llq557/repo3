package edu.wlxy.ch10;

import java.io.File;

public class FileAttributeTest {

	public static void main(String[] args) {
		File file=new File("2020.jpeg");
		System.out.println("文件或目录是否存在："+file.exists());
		System.out.println("是文件吗？"+file.isFile());
		System.out.println("是目录吗？"+file.isDirectory());
		System.out.println("文件名："+file.getName());
		System.out.println("文件路径："+file.getPath());
		System.out.println("文件绝对路径："+file.getAbsolutePath());
		System.out.println("文件大小(字节)："+file.length());
	}

}
