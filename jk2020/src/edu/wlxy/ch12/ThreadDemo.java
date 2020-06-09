package edu.wlxy.ch12;

class Thread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"为第 "+i+"位学生西餐服务");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"为第"+i+"位学生提供米饭服务");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}


public class ThreadDemo {
	public static void main(String[] args) {
		Runnable  t1=new Thread1() ;
		Runnable  t2=new Thread2() ;
		Runnable  t3=new Thread2() ;
		Runnable  t4=new Thread2() ;
		new Thread(t1,"窗口1").start();
		new Thread(t2,"窗口2").start();
		new Thread(t3,"窗口3").start();
		new Thread(t4,"窗口4").start();
	}

}
