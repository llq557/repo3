package edu.wlxy.ch02;

/*
 * 韩嫣参加计算机编程大赛
如果获得第一名，将参加麻省理工大学组织的1个月夏令营
如果获得第二名，将奖励惠普笔记本电脑一部
如果获得第三名，将奖励移动硬盘一个
否则，不给任何奖励

使用多个 if 解决问题
 */
public class MulIftoSwitchdemo {

	public static void main(String[] args) {

		int mingCi = 5;    //名次
        if (mingCi == 1) {
            System.out.println("参加麻省理工大学计算机学院组织1个月夏令营");
        } else if (mingCi == 2) {
            System.out.println("奖励hp笔记本一部");
        } else if (mingCi == 3) {
            System.out.println("奖励移动硬盘一部");
        } else {
            System.out.println("没有任何奖励");
        }

	}


}
