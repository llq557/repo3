package edu.wlxy.ch04;

import java.util.concurrent.SynchronousQueue;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person p1=new Person();
     p1.setName("tom");
     p1.setAge(59);
     p1.showInfo();
   System.out.println("---"+p1.getName());
     
     Person p2=new Person("谭礼");
     
     p2.setAge(-19);
     p2.showInfo();
     p2.eat();
     Person p3=new Person(-19);
    
     p3.showInfo();
     
   Person p4=new Person("刘备",258);
  
   p4.showInfo();
   
   
   System.out.println("=============");
   Student st1=new Student();
 
   st1.setName("周贤宁");
   st1.exam();
   st1.eat();

    Student st2=new Student("tom");
       st2.eat();
     Student st3=new Student("鹿晗",19,201940001);
       st3.eat(1800);
       st3.showInfo();
    
       System.out.println(st3.abc);
//     多态的的表现形式1：方法重载、方法重写。
//       在实际编程的时候，计算机会根据变量类型的不同、参数的不同，自动的执行相对应的方法。
       p2.eat();//p2是Person类型
       st2.eat();//st2是Student类型
       st3.eat(1800);//st3是Student类型,参数不同
//       多态的的表现形式2：父类变量，实际是子类对象。 is-a关系
     Person pst1=new Student("张飞",28,201940022);  
       pst1.eat();
      
//       Student stp1=new Person();//编译错误，不满足is-a  关系
       
	}

}
