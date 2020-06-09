package edu.wlxy.ch12;

public class Example04 {
	public static void main(String[] args) {
		new TicketWindow1("文理学院售票处").start(); // 创建第一个线程对象TicketWindow并开启
		new TicketWindow1("长江大学售票处").start(); // 创建第二个线程对象TicketWindow并开启
		new TicketWindow1("荆州古城售票处").start(); // 创建第三个线程对象TicketWindow并开启
			}
}
class TicketWindow1 extends Thread {
	
	
	public TicketWindow1(String name){
		setName(name);
	}
	private int tickets = 100;
	public void run() {
		while (true) { // 通过死循环语句打印语句
		  if (tickets > 0) {
			Thread th = Thread.currentThread(); // 获取当前线程
			String th_name = th.getName(); // 获取当前线程的名字
		   System.out.println(th_name + " 正在发售第 " + tickets-- + " 张票 ");
			}
		}
	}
}
