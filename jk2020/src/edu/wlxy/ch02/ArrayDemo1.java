package edu.wlxy.ch02;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int a[]={10,56,13,78,6,90};
		int[] b=new int[6];//java中没有赋初值，对应int型变量 默认值是0
		String[] name=new String[]{"中国","湖北","武汉"};
		
		System.out.println(a[0]);
		System.out.println(b[1]);
		System.out.println(name[2]);
		//方法1
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("----------");
		//Arrays.sort(a);
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		System.out.println("--复制---");
//		System.arraycopy(a, 1, b, 2, 3);
//		for(int i=0;i<b.length;i++){
//			System.out.println(b[i]);
//		}
		
		System.out.println(b);
	}

}
