package edu.wlxy.ch05;
/**
 * 正方形。
 */
class Square extends Shape {
	private double height = 0; // 正方形的边长
	
	public Square(double height) {
		this.height = height;
	}
	public double getArea() {
		return (this.height * this.height);
	}
	public double getPerimeter() {		
		return 4*height;
	}
}