package edu.wlxy.ch08;

import java.util.Random;

public class Mathdemo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-9));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random());
		System.out.println(Math.round(8.3));
		System.out.println("----------");
		Random rd=new Random();
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextInt());
		System.out.println(rd.nextInt(50));
	}

}
