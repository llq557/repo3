package edu.wlxy.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QQJframedemo extends JFrame {

	private JPanel contentPane;
	private JTextField tf_username;
	private JPasswordField tf_userpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQJframedemo frame = new QQJframedemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QQJframedemo() {
		setTitle("QQ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("账号：");
		lblNewLabel.setIcon(new ImageIcon("E:\\workspace2020\\jk2020\\p1.png"));
		lblNewLabel.setFont(new Font("等线", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(134, 80, 94, 32);
		contentPane.add(lblNewLabel);
		
		tf_username = new JTextField();
		tf_username.setBounds(238, 83, 142, 27);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		JLabel label = new JLabel("\u5BC6\u7801\uFF1A");
		label.setIcon(new ImageIcon("E:\\workspace2020\\jk2020\\p2.png"));
		label.setForeground(Color.BLUE);
		label.setFont(new Font("幼圆", Font.PLAIN, 16));
		label.setBounds(142, 133, 86, 21);
		contentPane.add(label);
		
		tf_userpwd = new JPasswordField();
		tf_userpwd.setEchoChar('*');
		tf_userpwd.setBackground(Color.WHITE);
		tf_userpwd.setBounds(238, 130, 142, 27);
		contentPane.add(tf_userpwd);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\workspace2020\\jk2020\\qq.png"));
		lblNewLabel_1.setBounds(10, 67, 114, 122);
		contentPane.add(lblNewLabel_1);
		
		JButton btn_login = new JButton("\u767B\u5F55");
//	采用匿名内部类的方式，描述事件处理 的方法。
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				要求：在控制台打印输出 用户输入的账号和密码
				String name=tf_username.getText().trim();//trim()删除字符串首尾的空格
				String pwd =tf_userpwd.getText().trim();
				String selename=tf_username.getSelectedText().trim();
				System.out.println("你输入的账号是："+name);
				System.out.println("你输入的密码是："+pwd);
				System.out.println("你选择的内容是："+selename);
			}
		});
		btn_login.setIcon(new ImageIcon("E:\\workspace2020\\jk2020\\2020.jpeg"));
		btn_login.setBounds(134, 197, 93, 23);
		contentPane.add(btn_login);
		
//		重置按钮功能
		JButton btn_reset = new JButton("\u91CD\u7F6E");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_username.setText("");//将账号文本框中的内容改成空白
				tf_userpwd.setText("");
			}
		});
		btn_reset.setBackground(new Color(255, 192, 203));
		btn_reset.setForeground(Color.RED);
		btn_reset.setBounds(270, 197, 93, 23);
		contentPane.add(btn_reset);
	}

}
