package edu.wlxy.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class QQJFramedemo2 extends JFrame {

	private JPanel contentPane;
	private JTextArea ta_chatinfo;
	private JTextArea ta_sendinfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQJFramedemo2 frame = new QQJFramedemo2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void sendMessage() {
		String message=ta_sendinfo.getText();
//		如果没输入内容或 只有空格，不允许发送
		if(message!=null && !message.trim().equals("")){
		ta_chatinfo.append("罗平安：\n"+message+"\n");
		
		}else{
			//ta_chatinfo.append("----警告：不能发送空消息 \n");
			JOptionPane.showMessageDialog(
					this,"不能发送空消息，请输入内容。","提示", JOptionPane.CLOSED_OPTION); 

		}
		ta_sendinfo.setText("");//发送之后，发送框中的内容清空
	}
	
	/**
	 * Create the frame.
	 */
	public QQJFramedemo2() {
		setTitle("\u804A\u5929\u7A97\u53E3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 341, 271);
		contentPane.add(scrollPane);
		
		ta_chatinfo = new JTextArea();
		scrollPane.setViewportView(ta_chatinfo);
		
		ta_sendinfo = new JTextArea();
		ta_sendinfo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
//				e.getKeyChar()按键上的符号
				//System.out.println(e.getKeyChar());
				  if(e.getKeyChar()==KeyEvent.VK_ENTER&&e.isControlDown()){
						sendMessage();
				  }
			}
		});
		ta_sendinfo.setBounds(10, 281, 240, 68);
		contentPane.add(ta_sendinfo);
		
		JButton btn_send = new JButton("\u53D1\u9001");
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
			
		});
		btn_send.setBounds(260, 300, 67, 23);
		contentPane.add(btn_send);
		
		
		
		
	}
}
