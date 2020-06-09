package edu.wlxy.ch04;
/*
 * 演示构造方法、方法重载
 * 
 */
public class Person {
private  String  name;//成员变量
private int  age;
private String  sex;
     int abc=1000; 
   
public   void eat(){
	System.out.println(name+"吃小龙虾。");
}
public void showInfo(){
	System.out.println(name+"，今年"+age+"岁了。");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public int getAge() {
	return age;
}

public void setAge(int age){
//  若age<0 或 age>150  就使用默认值 18.
	if(age<0 || age>150){
   	 this.age=18;
    }else{
    	this.age=age;	
    }
}


//定义1个构造方法，为2个成员变量赋初值
public Person(){
}
//定义1个构造方法，为1个成员变量赋初值
public Person(String name){//局部变量
	this.name=name; // this 用来区分成员变量和局部变量的 关键字
}
public Person(int  age){
	this.setAge(age);
}

public Person(String name, int age) {
	this.name = name;
	this.setAge(age);
}

public Person(String name, int age, String sex) {
	this.name = name;
	this.setAge(age);
	this.sex = sex;
}


}
