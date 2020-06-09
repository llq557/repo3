package edu.wlxy.ch11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFramedemo2 extends JFrame implements ActionListener {
private JButton jbu2;
private JButton jbu1;

public MyFramedemo2(){
	 JFrame  jf=new JFrame();
	   jf.setTitle("测试");
	   jf.setSize(300,200);
	   jf.setLocation(300, 500);
	   jf.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置窗口的关闭 功能
     jf.setVisible(true);//必须要设置 可见性
     
     
     jbu1 = new JButton();
     jbu2 = new JButton();
     JButton  jbu3=new JButton("沙和尚");
     jbu1.setText("孙悟空");
     jbu2.setText("猪八戒");
     
     JPanel jpa1=new JPanel();
     jpa1.setBackground(new Color(100,100,100));
    jpa1.setLayout(new FlowLayout());
    jpa1.add(jbu1);
    jpa1.add(jbu2);
    jpa1.add(jbu3);
    
    jf.add(jpa1);
    
//    事件处理
//    单击孙悟空按钮，猪八戒 按钮 变成 白龙马
    jbu1.addActionListener(this);
//    单击沙和尚按钮，第2个按钮变成 唐三藏。  
    jbu3.addActionListener(this);
}
//事件处理方法
@Override
public void actionPerformed(ActionEvent e) {
	// 如何区分事件源？
//	有2种方法
//	方法1：e.getSource() 确定事件源的名称
	if(e.getSource()==jbu1){
	System.out.println("你单击了孙悟空按钮。");
	jbu2.setText("白龙马");
	}
//	方法2：e.getActionCommand() 获取事件源控件 上的文字
	if(e.getActionCommand().equals("沙和尚")){
		System.out.println("你单击了沙和尚按钮。");
		jbu2.setText("唐三藏");
	}
	
}
	
	public static void main(String[] args) {
		new MyFramedemo2();

	}


	

}
