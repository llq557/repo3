package edu.wlxy.ch11;

import java.awt.*;

import javax.swing.*;

public class MyFramedemo3 extends JFrame {
public MyFramedemo3(){
	JFrame jf=new JFrame();
	jf.setTitle("测试");
	jf.setSize(600, 300);
	//jf.setLocation(200, 400);//设置窗口的位置
	jf.setLocationRelativeTo(null);//设置窗口在屏幕的正中央
	jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭按钮的功能
	jf.setBackground(Color.red );
	jf.setVisible(true);// 必须设置可见性
	
//	创建小的组件
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
//	3.1 设置窗口的布局管理器
//	border布局，分为5个部分，需要指定组件的位置
	jf.setLayout(new BorderLayout());
	
  //	3.2将组件添加到容器中
	jf.getContentPane().add(jbu1,BorderLayout.NORTH);
	jf.getContentPane().add(jbu2,BorderLayout.SOUTH);
	jf.getContentPane().add(jbu3,BorderLayout.EAST);
	jf.getContentPane().add(jbu4,BorderLayout.WEST);
	jf.getContentPane().add(jbu5,BorderLayout.CENTER);
	

}
	
	
	public static void main(String[] args) {
		new MyFramedemo3();

	}

}
