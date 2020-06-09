package edu.wlxy.ch06;


/**
 * 测试类。
 * 演示实现多个接口
 */
public class Test {
	public static void main(String[] args) {
		
		//1、创建软件工程师对象
		SoftEngineer xiaoMing = new SoftEngineer("小明");
		System.out.println("我是一名软件工程师，我的名字叫"
				+xiaoMing.getName()+"。");
		
		//2、软件工程师进行代码编写	
		xiaoMing.writeProgram();
		
		//3、软件工程师进行业务讲解	
		xiaoMing.giveBizSpeech();

		
	}
}
