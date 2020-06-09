package edu.wlxy.ch02;

public class ForDemo3 {
/*
 * 输出加法表
使用for循环
1. 循环初始化：i = 0；j = 输入值
2. 循环条件：i<=输入值
3. 循环操作：计算i+j
4. 循环变量的改变：i++，j--

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
   for(int i=0,j=n;   i<=n;   i++,j--){
	   System.out.println(i+"+"+j+"="+(i+j));
   }
	}

}
