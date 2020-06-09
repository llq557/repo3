package edu.wlxy.ch09;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
//list  是一个长度可变化的 特殊数组。
//	一个list中可以存储多种类型的数据，因为list的源代码中使用泛型来定义编写
//	list 允许存储重复值，有序号的。
	public static void main(String[] args) {
	ArrayList alist=new ArrayList();
	alist.add("雷神");
	alist.add("美国队长");
	alist.add("绿巨人");
	alist.add("神龟兄弟");
	alist.add(789);
	alist.add("雷神");
	System.out.println("alist容量："+alist.size());
	for(int i=0;i<alist.size();i++){
		System.out.println(alist.get(i));
	}
	alist.add(1,"钢铁侠");
	alist.remove(0);
	System.out.println("alist容量："+alist.size());
	for(int i=0;i<alist.size();i++){
		System.out.println(alist.get(i));
	}
	
	
	
	System.out.println("------------------");
//	ArrayList<String> blist  声明blist 中只能存放String 类型的数据。
	ArrayList<String> blist=new ArrayList<String>();
	blist.add("雷神");
	blist.add("美国队长");
	blist.add("绿巨人");
	blist.add("神龟兄弟");
	//blist.add(789);
	blist.add("雷神");
	System.out.println("blist容量："+blist.size());
	System.out.println("-----方法1----");
//	遍历集合元素  方法1
	for(int i=0;i<blist.size();i++){
		System.out.println(blist.get(i));
	}
	System.out.println("-----方法2----");
//	遍历集合元素  方法2	 foreach
	for(String xx:blist){
		System.out.println(xx);
	}
	System.out.println("-----方法3----");
//	遍历集合元素  方法3	java中设计了专用的迭代器来完成集合的遍历
	Iterator it=blist.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}

}
