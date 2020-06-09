package edu.wlxy.ch09;

import java.util.*;

public class HashMapdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> ma=new HashMap<Integer,String>();
		ma.put(201801, "jack");
		ma.put(201802, "rose");
		
		System.out.println(ma.get(201802));
		Set<Integer> keyset=ma.keySet();
         for(Integer kk:keyset){
         	System.out.println(ma.get(kk));
         }
System.out.println("---------------");
		
		Map countries = new HashMap();
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");
		
		String country = (String) countries.get("CN");
		System.out.println("CN对应的国家是：" + country);
		
		System.out.println("Map中共有"+countries.size()+"组数据");
		
		countries.remove("FR");
		System.out.println("Map中包含FR的key吗？" + 
				countries.containsKey("FR"));
		
		System.out.println( countries.keySet() ) ;
		System.out.println( countries.values() );
		System.out.println( countries );
		
		
		
	}

}
