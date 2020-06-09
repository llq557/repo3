package edu.wlxy.ch12;

public class Example05 {
	public static void main(String[] args) {
		TicketWindow2 task = new TicketWindow2();//创建线程的任务类对象
		new Thread(task, "文理学院售票处").start();//创建线程并起名为窗口1， 开启线程
		new Thread(task, "长江大学售票处").start();//创建线程并起名为窗口2， 开启线程
		new Thread(task, "荆州古城售票处").start();//创建线程并起名为窗口3， 开启线程
			}
}
//线程的任务类
class TicketWindow2 implements Runnable {
	private int tickets = 100;
	@Override
	public void run() {
		while(true){
			if (tickets > 0) {
			Thread th = Thread.currentThread();//获取当前运行run方法的线程
			String th_name = th.getName();//得到线程的名称
			System.out.println(th_name + "正在发售第" + tickets-- + "张票");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}
}

