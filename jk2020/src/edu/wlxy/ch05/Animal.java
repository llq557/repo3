package edu.wlxy.ch05;
/**
 * 动物类，
 * 演示抽象类。
 * 一般用抽象方法规范子类的行为。
 */
public abstract class Animal {
	private int age = 0;//年龄
	/**
	 *  用于获取信息的抽象方法。 
	 */
	public  void info(){
		//方法体中没有代码，
	}
	public  abstract void eat();
	
	
public Animal() {
		
	}
	
	public Animal(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
