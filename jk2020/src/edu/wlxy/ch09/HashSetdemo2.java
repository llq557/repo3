package edu.wlxy.ch09;

import java.util.*;

import edu.wlxy.ch04.Person;
//set 不允许有重复值
public class HashSetdemo2 {

	public static void main(String[] args) {
		HashSet<String>  hs=new HashSet<String>();
		hs.add("abc");
		hs.add("ab");
		hs.add("ac");
		hs.add("ab");
		System.out.println(hs.size());
		System.out.println(hs);
	
		for(String xx:hs){
			System.out.println(xx);
		}
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		Person  p1=new Person("jack",18);
		Person  p2=new Person("rose",18);
		Person  p3=new Person("jack",18);
		Person  p4=p2;
		// p1与p3存储的位置是不同，值相同的。  p2和p4 是同一个对象，位置肯定相同
//		set 说元素不能重复，会自动判断是否重复，判断标准 是比较存储位置。
		HashSet<Person>  hsp=new HashSet<Person>();
		hsp.add(p1);
		hsp.add(p2);
		hsp.add(p3);
		hsp.add(p4);
		System.out.println(hsp.size());
		System.out.println(hsp);//这种输出方法不可取
		Iterator it2=hsp.iterator();
		while(it2.hasNext()){
			Person p=(Person)it2.next();
			p.showInfo();
		}
	}

}
