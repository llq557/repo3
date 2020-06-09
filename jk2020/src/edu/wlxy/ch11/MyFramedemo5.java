package edu.wlxy.ch11;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFramedemo5 {

	public MyFramedemo5(){
		JFrame jf=new JFrame();
		jf.setTitle("测试");
		jf.setSize(600, 300);
		//jf.setLocation(200, 400);//设置窗口的位置
		jf.setLocationRelativeTo(null);//设置窗口在屏幕的正中央
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭按钮的功能
		jf.setBackground(Color.red );
		jf.setVisible(true);// 必须设置可见性
		
//		创建小的组件
		JButton jbu1=new JButton();
		JButton jbu2=new JButton();
		JButton jbu3=new JButton("沙和尚");
		JButton jbu4=new JButton("白骨精");
		JButton jbu5=new JButton("嫦娥");
		jbu1.setText("孙悟空");
		jbu2.setText("猪八戒");
		
		// 1 窗口
		// 2 各种组件
		// 3 布局，  各种组件在窗口中如何摆放
//		3.1 设置窗口的布局管理器
		jf.setLayout(new GridLayout(2,3));
		
	  //	3.2将组件添加到容器中
		jf.getContentPane().add(jbu1);
		jf.getContentPane().add(jbu2);
		jf.getContentPane().add(jbu3);
		jf.getContentPane().add(jbu4);
		jf.getContentPane().add(jbu5);

	}
		
		
		public static void main(String[] args) {
			new MyFramedemo5();

		}

}
