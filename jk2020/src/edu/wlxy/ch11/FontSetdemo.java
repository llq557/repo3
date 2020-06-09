package edu.wlxy.ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FontSetdemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JCheckBox chb_bold;
	private JCheckBox chb_italic;
	private JLabel la_title;
	private JRadioButton rdbtn_red;
	private JRadioButton rdbtn_green;
	private JRadioButton rdbtn_blue;
	private JComboBox cbox_fontsize;
	static int  fsize=18;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem mitem_save;
	private JMenuItem mitem_open;
	private JMenuItem menuItem_2;
	private JMenuItem mitem_bold;
	private JMenuItem mitem_italic;
	private JMenuItem mitem_red;
	private JMenuItem mitem_green;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FontSetdemo frame = new FontSetdemo();
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
	public FontSetdemo() {
		setTitle("\u7C7B\u4F3C\u5B57\u4F53\u5BF9\u8BDD\u6846");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		la_title = new JLabel("\u957F\u6C5F\u5927\u5B66\u6587\u7406\u5B66\u9662");
		
		la_title.setFont(new Font("宋体", Font.PLAIN ,18));
		la_title.setBounds(25, 111, 335, 89);
		contentPane.add(la_title);
		
		chb_bold = new JCheckBox("\u52A0\u7C97");
		chb_bold.setBounds(43, 206, 62, 23);
		contentPane.add(chb_bold);
		
		chb_italic = new JCheckBox("\u659C\u4F53");
		chb_italic.setBounds(124, 206, 103, 23);
		contentPane.add(chb_italic);
		
		rdbtn_red = new JRadioButton("\u7EA2\u8272");
		rdbtn_red.setBounds(43, 241, 79, 23);
		contentPane.add(rdbtn_red);
		
		rdbtn_green = new JRadioButton("\u7EFF\u8272");
		rdbtn_green.setBounds(124, 241, 72, 23);
		contentPane.add(rdbtn_green);
		
		rdbtn_blue = new JRadioButton("\u84DD\u8272");
		rdbtn_blue.setBounds(204, 241, 121, 23);
		contentPane.add(rdbtn_blue);
		
//		利用按钮组 ，达到单选按钮互斥的效果：同时只能选一个
		ButtonGroup  bgroup =new ButtonGroup();
		bgroup.add(rdbtn_blue);
		bgroup.add(rdbtn_green);
		bgroup.add(rdbtn_red);
		
		cbox_fontsize = new JComboBox();
		cbox_fontsize.setModel(new DefaultComboBoxModel(new String[] {"16", "18", "22", "26", "30", "34", "38", "42"}));
		cbox_fontsize.setBounds(43, 285, 50, 21);
		contentPane.add(cbox_fontsize);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 429, 21);
		contentPane.add(menuBar);
		
		menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		mitem_save = new JMenuItem("\u4FDD\u5B58");
		menu.add(mitem_save);
		
		mitem_open = new JMenuItem("\u6253\u5F00");
		menu.add(mitem_open);
		
		menuItem_2 = new JMenuItem("\u5173\u95ED");
		menu.add(menuItem_2);
		
		JMenu menu_font = new JMenu("\u5B57\u4F53");
		menuBar.add(menu_font);
		
		mitem_bold = new JMenuItem("\u52A0\u7C97");
		menu_font.add(mitem_bold);
		
		mitem_italic = new JMenuItem("\u659C\u4F53");
		mitem_italic.setEnabled(false);
		menu_font.add(mitem_italic);
		
		menu_font.addSeparator();
		
		mitem_red = new JMenuItem("\u7EA2\u8272");
		menu_font.add(mitem_red);
		
		mitem_green = new JMenuItem("\u7EFF\u8272");
		menu_font.add(mitem_green);
		
		
		chb_bold.addActionListener(this);
		chb_italic.addActionListener(this);
		rdbtn_red.addActionListener(this);
		rdbtn_blue.addActionListener(this);
		rdbtn_green.addActionListener(this);
		cbox_fontsize.addActionListener(this);
		mitem_bold.addActionListener(this);
		mitem_red.addActionListener(this);
		mitem_green.addActionListener(this);
		mitem_open.addActionListener(this);
		mitem_save.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		设置字形 加粗 斜体等
		int mode=0;// 记录font的样式风格
		if(chb_bold.isSelected()){
			mode=mode+Font.BOLD;
		}
		if(chb_italic.isSelected()){
			mode=mode+Font.ITALIC;
		}
//		设置颜色
		Color  color=null;
		if(rdbtn_red.isSelected()){
			color=Color.red;
		}else if(rdbtn_green.isSelected()){
			color=Color.green;
		}
		else if(rdbtn_blue.isSelected()){
			color= new Color(10,10,220);//自定义颜色
		}
//	设置字号
		
	
		if(e.getSource()==cbox_fontsize){
			String size=(String)cbox_fontsize.getSelectedItem();
			fsize=Integer.parseInt(size);
		}
		
		la_title.setFont(new Font("黑体", mode ,fsize));
		la_title.setForeground(color);

//		处理菜单项 的内容
		if(e.getSource()==mitem_bold){
			la_title.setFont(new Font("黑体", Font.BOLD ,fsize));
		}
		if(e.getSource()==mitem_red){
			la_title.setForeground(Color.RED);
		}
		if(e.getSource()==mitem_green){
			la_title.setForeground(new Color(10,180,100));
		}
		if(e.getSource()==mitem_open){
			JFileChooser f=new JFileChooser();
			f.showOpenDialog(this);
		}
		if(e.getSource()==mitem_save){
			JFileChooser f=new JFileChooser();
			f.showSaveDialog(this);
		}
	}
}
