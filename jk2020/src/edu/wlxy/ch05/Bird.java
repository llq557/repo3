package edu.wlxy.ch05;
/**
 * 鸟类，继承自动物类。
 */
public  class Bird extends Animal {
	private String color = "红色";//颜色
	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void info() {
		System.out.println("我是一只" + color + "的鸟！");
		System.out.println("今年" + this.getAge() + "岁了！");
		System.out.println();
	}
	public void eat(){
		System.out.println("早起的鸟儿有虫吃");
	}
	
	
	
	
	
}
