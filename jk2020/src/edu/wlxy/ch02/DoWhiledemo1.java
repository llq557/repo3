package edu.wlxy.ch02;

public class DoWhiledemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;//统计输出的记录数量
        int c=80;//摄氏度
        double f=0;//华氏温度
		do{
			f=c*9/5.0+32;
			System.out.println(c+"对应的华氏温度是"+f);
			i++;
			c=c+20;
		}while(i<=10 && c<=250);

		
	}

}
