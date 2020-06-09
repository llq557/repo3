package edu.wlxy.ch11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo1 extends JFrame implements ActionListener{
	private JButton jbu2;
private JButton jbu3;
private JButton jbu1;


public EventDemo1(){
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
//	4.1要求：单击孙悟空按钮，将猪八戒按钮 变成 白龙马
	jbu1.addActionListener(this);//添加监听器
//	要求  单击沙和尚按钮，将第二个按钮 变成 唐三藏
    jbu3.addActionListener(this);
}
//4.2 事件处理方法
@Override
public void actionPerformed(ActionEvent e) {
//	如何区分事件源？
//	有2种方式
//	方式1  e.getSource()获取事件源的 控件名称
	if(e.getSource()==jbu1){
	System.out.println("你单击了孙悟空按钮。");
	jbu2.setText("白龙马");
	}
//方式2  e.getActionCommand() 获取事件源上 显示的文字信息
	else if(e.getActionCommand().equals("沙和尚")){
		System.out.println("你单击了沙和尚空按钮。");
		jbu2.setText("唐三藏");
	}
}
	
	
	public static void main(String[] args) {
		new EventDemo1();

	}



	

}
