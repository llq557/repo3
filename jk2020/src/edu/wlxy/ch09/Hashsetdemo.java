package edu.wlxy.ch09;

import java.util.*;

import edu.wlxy.ch04.Person;



public class Hashsetdemo {

	public static void main(String[] args) {

		Set ss=new HashSet();
		ss.add(12);
		ss.add(13);
		ss.add(33);
		ss.add(45);
		ss.add(78);
		ss.add(13);
		System.out.println("集合的元素个数："+ss.size());
		Iterator it=ss.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}	
	
		Person p1=new Person("abc",18);
		Person p2=new Person("ab",18);
		Person p3=new Person("abc",18);
		Person p4=new Person("abd",18);
		
		Set sst=new HashSet();
		sst.add(p1);
		sst.add(p2);
		sst.add(p3);
		sst.add(p4);
		System.out.println("集合的元素个数："+sst.size());
		Iterator itt=sst.iterator();
		while(itt.hasNext()){
			System.out.println(itt.next());
		}	
		
	}

}
