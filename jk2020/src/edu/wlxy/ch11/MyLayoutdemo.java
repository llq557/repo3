package edu.wlxy.ch11;

import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;

public class MyLayoutdemo extends JFrame {

	public MyLayoutdemo(){
		JFrame jf=new JFrame();
		jf.setTitle("测试");
		jf.setSize(600, 300);
		//jf.setLocation(200, 400);//设置窗口的位置
		jf.setLocationRelativeTo(null);//设置窗口在屏幕的正中央
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭按钮的功能
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
//		引入 普通窗口  
		JPanel jp1=new JPanel();
		jp1.setBackground(Color.green);
//		3.1 设置窗口的布局管理器
		jp1.setLayout(new GridLayout(2,3));
	  //	3.2将组件添加到容器中
		jp1.add(jbu1);
		jp1.add(jbu2);
		jp1.add(jbu3);
		jp1.add(jbu4);
		jp1.add(jbu5);

		JPanel jp2=new JPanel();
		jp2.setBackground(new Color(100,120,50));
		JButton jbu6=new JButton("如来");
		JButton jbu7=new JButton("观音");
		jp2.setLayout(new FlowLayout());
		jp2.add(jbu6);
		jp2.add(jbu7);
		
		jf.setLayout(new BorderLayout());
		jf.getContentPane().add(jp1,BorderLayout.NORTH);
		jf.getContentPane().add(jp2,BorderLayout.CENTER);
	}
		
		
		public static void main(String[] args) {
			new MyLayoutdemo();

		}

}
