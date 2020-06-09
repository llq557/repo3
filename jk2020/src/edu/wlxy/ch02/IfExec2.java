package edu.wlxy.ch02;

import java.util.Scanner;

/*
 * 抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员
 * 实现思路
 *    1.产生随机数
 *    2.从控制台接收一个4位会员号
 *    3.分解获得百位数
 *    4.判断是否是幸运会员
 *    提示：产生随机数（0~9）的方法
 *     int random=(int)(Math.random()*10);
 */
public class IfExec2 {

	public static void main(String[] args) {
		/* 产生随机数
		 * Math.random()产生一个 大于等于0 ，小于1 的  小数。
		 *  
		 *   */
		int  r=(int)(Math.random()*10); //因为要和百位上的数字比较大小，所以要强制类型转换。
		System.out.println("产生的随机数是"+r);
		
		
		/* 从控制台接收一个4位会员号 */
		System.out.println("-------------幸运抽奖------------");
		System.out.print("请输入4位会员号： ");
		Scanner sc=new Scanner(System.in);
		int custNo=sc.nextInt();

		/* 分解获得百位 */
		int baiwei = 0;
		baiwei=custNo/100%10;
		
		/* 判断是否是幸运会员 */
		//   添加注释 或者取消注释的快捷键： ctrl+/ 
		if (baiwei==r) {
			System.out.println(custNo + "是幸运客户，获精美手机一个。");
		} else {
			System.out.println(custNo + "  谢谢您的支持！");
		}


	}

}
