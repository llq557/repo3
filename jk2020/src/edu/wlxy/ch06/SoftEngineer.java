package edu.wlxy.ch06;



/**
 * 软件工程师。
 *  演示实现多个接口
 */
public class SoftEngineer implements Programmer, BizAgent {

	private String name;// 软件工程师姓名

	public SoftEngineer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void giveBizSpeech() {
		System.out.println("我会讲业务。");
	}
	public void writeProgram() {
		System.out.println("我会写代码。");
	}
}
