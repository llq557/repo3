package edu.wlxy.ch04;

public class SchoolTest {
  public static void main(String[] args ){
	  // 1 类的实例化   -----根据类 创建 对象（变量）
//	   int  x=11;
	  School   sc1=new School();
	  
//	   2 引用对象的属性或 方法
	
      sc1.showInfo();
	 
	  
	  School sc2=new School();
	  sc2.sname="文理学院";
	  sc2.scnumber=200;
	 sc2.showInfo();
  }
}
