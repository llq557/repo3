package edu.wlxy.ch05;
class Circle extends Shape {
	private double radius = 0; // 圆的半径
	private final static double PI = 3.14; // 圆周率
	/**
	 * 有参构造方法。
	 *  radius 半径
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (PI * radius * radius);
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}
}
