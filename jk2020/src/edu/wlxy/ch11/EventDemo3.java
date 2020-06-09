package edu.wlxy.ch11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo3 extends JFrame implements MouseListener {
	private JButton jbu2;
private JButton jbu3;
private JButton jbu1;


public EventDemo3(){
	JFrame jf=new JFrame();
	jf.setTitle("测试");
	jf.setSize(600, 300);
	//jf.setLocation(200, 400);//设置窗口的位置
	jf.setLocationRelativeTo(null);//设置窗口在屏幕的正中央
	jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭按钮的功能
	jf.setVisible(true);// 必须设置可见性
	
jbu1 = new JButton();
	jbu2=new JButton();  //局部变量快速转换为  成员变量  。 ctrl+1  , convert  local  to field
	jbu3 = new JButton("沙和尚");
	
	jbu1.setText("孙悟空");
	jbu2.setText("猪八戒");
	
	// 1 窗口
	// 2 各种组件
	// 3 布局，  各种组件在窗口中如何摆放
//	  4  事件 ，某个动作发生后，该做哪些事情。
//	3.1 设置窗口的布局管理器
	jf.setLayout(new FlowLayout());
  //	3.2将组件添加到容器中
	jf.getContentPane().add(jbu1);
	jf.getContentPane().add(jbu2);
	jf.getContentPane().add(jbu3);
//	4.1要求：单击孙悟空按钮，将猪八戒按钮 变成 白龙马  ，利用鼠标监听器来完成
//	jbu1.addActionListener(this);//添加动作监听器
	jbu1.addMouseListener(this);
//	要求  单击沙和尚按钮，将第二个按钮 变成 唐三藏 ,利用鼠标监听器来完成,采用匿名内部类的方式书写
//    jbu3.addActionListener(this);
//	java事件提出了事件适配器 类。
//	以前事件接口中的所有方法都是抽象方法，假设有5个，那就必须重写5个方法（不管你用几个，都必须写5个）
//	事件适配器类， 假设有5个空方法，你用1个就写1个，用2个就写2个，减少了代码的书写量。
	jbu3.addMouseListener(new MouseAdapter(){
		@Override
		public void mousePressed(MouseEvent e) {
			jbu2.setText("唐三藏");
		}
	});
}


	
	
	public static void main(String[] args) {
		new EventDemo3();

	}
//4.2 事件处理方法
//	因为MouseListener接口中有5个抽象方法，实现子类必须 重写 这5个方法。
	@Override
	public void mouseClicked(MouseEvent e) {
//		单击 包含2个过程 ：按下，释放 左键
		System.out.println("mouseClicked");
		jbu2.setText("白龙马1");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		 包含1个过程 ：按下 左键
		System.out.println("mousePressed");
		jbu2.setText("白龙马2");
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	

}
