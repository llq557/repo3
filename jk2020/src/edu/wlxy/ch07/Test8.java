package edu.wlxy.ch07;



public class Test8 {
	
	public static void main(String[] args)  {
		Person person = new Person();

		try {
			person.setSex("ÄÐ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			person.print();


		
			

	}

}
