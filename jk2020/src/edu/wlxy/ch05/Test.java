package edu.wlxy.ch05;
/**
 * 测试类。
 */
public class Test {
	/**
	 * 分别创建Bird、Fish类的对象 在控制台输出对象的信息。
	 */
	public static void main(String[] args) {
		Bird bird = new Bird(4, "红色");
		Fish fish = new Fish(2, 5);
		bird.info();
		bird.eat();
		fish.info();
		fish.eat();
//		抽象类不能实例化对象
//		Animal  an=new Animal();
	}
}
