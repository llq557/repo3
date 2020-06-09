package edu.wlxy.ch02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CDemo {
	public static void main(String[] args) {
		int score; 		// 成绩
		int total; 		// 班级总人数
		int num = 0; 	// 成绩大于或等于80分的人数
		Scanner input = new Scanner(System.in);
		System.out.print("输入班级总人数: ");
		String st=JOptionPane.showInputDialog(
				null,"输入数字,用空格分隔","输入对话框", JOptionPane.PLAIN_MESSAGE);
		total = Integer.parseInt(st); 	// 输入班级总数
	//	total = input.nextInt(); 	// 输入班级总数
		for (int i = 1; i <=total; i++) {
			System.out.print("请输入第" + i + "位学生的成绩： ");
			score = input.nextInt();
			if (score < 80) {
				continue;
			}
			num++;
		}
		System.out.println("80分以上的学生人数是： " + num);
		double rate = (double) num / total * 100;
		System.out.println("80分以上的学生所占的比例为：" + rate + "%");
	}
}


