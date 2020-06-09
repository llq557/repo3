package edu.wlxy.ch11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class myframedemo4 extends JFrame implements ActionListener{
	JButton jbutton1;
	private JButton jbutton2;
	private JButton jbutton3;
	private JButton jbutton4;
	private JButton jbutton5;
	JLabel  jLb1,jLb2;
	public myframedemo4() {
		 JFrame  jf=new JFrame();
         jf.setTitle("我的第2个窗口");//设置窗口的标题
         jf.setSize(400, 400);//设置窗口的尺寸大小
         jf.setVisible(true);//默认状态，窗口是隐藏的，需要设置窗口必须显示
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭按钮时的处理办法
         jf.setLocationRelativeTo(null);//让窗口在屏幕的正中间
         
         //2 创建组件
         // 创建5个按钮
         jbutton1=new JButton("东邪");
         jbutton2 = new JButton("西毒");
         jbutton3 = new JButton("南帝");
         jbutton4 = new JButton("北丐");
         jbutton5 = new JButton("中神通");
         jLb1=new JLabel("请点击按钮试试");
         
         
         
         // 3 将组件摆放到窗口中
      //演示流布局方式
        // 3.1 首先设置窗口容器的布局方式
          jf.setLayout(new FlowLayout());//流布局 
         // 3.2 添加组件到容器中
          jf.getContentPane().add(jLb1);
         jf.getContentPane().add(jbutton1); //所有组件都是通过add()方法添加到容器中
         jf.getContentPane().add(jbutton2);
         jf.getContentPane().add(jbutton3);
         jf.getContentPane().add(jbutton4);
         jf.getContentPane().add(jbutton5);
         
         
         // 添加监听器
         jbutton1.addActionListener(this);
         jbutton2.addActionListener(this);
         
      
	}
	public static void main(String[] args) {
		new myframedemo4();

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbutton1){
			jbutton1.setText("我武功第一");
			jbutton2.setText("孙悟空");
			jLb1.setIcon(new ImageIcon("jie.PNG"));
			
		}
		else if(e.getSource()==jbutton2){
			jbutton3.setIcon(new ImageIcon("gedaye.jpg"));
		}
		
		
		
		//jbutton1.setRolloverIcon(new ImageIcon("baby.jpg"));
	    //jbutton1.setPressedIcon(new ImageIcon("jie.PNG"));
		
	}

}
