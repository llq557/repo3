package edu.wlxy.ch02;

public class ForExec1 {
/*
 * 1.在控制台输出数字1~10。
2.在控制台输出数字10~1。
3.求1~100的所有整数之和。
4.求1~100的所有奇数和。
5.输出6的阶乘。
6.在控制台输出1000以内所有的水仙花数，并统计输出水仙花数的个数。
 例如：153=1*1*1+5*5*5+3*3*3（百位、十位、个位 各数字的3次方之和等于自身）
7.输出1~1000之间，同时满足以下条件的数据有哪些？
	对3整除余2
	对5整除余3
	对7整除余2

 * 
 */
	public static void main(String[] args) {
	/*
		// 1.在控制台输出数字1~10。
		System.out.println("---------1----------");
for(int i=1;i<=10;i++){
	System.out.print(i+"\t");
}
		
		
		//2.在控制台输出数字10~1。
     System.out.println();  //产生1个换行操作
System.out.println("---------2----------");
for(int i=10;i>=1;i--){
	System.out.print(i+"\t");
}
*/
		//3.求1~100的所有整数之和。
System.out.println();  //产生1个换行操作
System.out.println("---------3----------");
int sum1=0;
for(int i=1;i<=10;i++){
	sum1=sum1+i;
	if(sum1>20){
		System.out.println(i);
		break;
	}
}
System.out.println("1~10的所有整数之和为"+sum1);
		//4.求1~100的所有奇数和。
	
//System.out.println();  //产生1个换行操作
//System.out.println("---------4----------");
////方法1
//int sum2=0;
//for(int i=1;i<=100;i=i+2){ // i的变化  是增加2  ， i都是奇数
//	sum2=sum2+i;
//}
//System.out.println("1~100的所有奇数之和为"+sum2);
////方法2
//int sum3=0;
//for(int i=1;i<=100;i++){ // 
//	if(i%2==1){
//	 sum3=sum3+i;
//	}
//}
//System.out.println("1~100的所有奇数之和:"+sum3);
//
//
//		//5.输出6的阶乘。
////7.输出1~1000之间，同时满足以下条件的数据有哪些？
////对3整除余2
////对5整除余3
////对7整除余2
//System.out.println("---------7----------");
//  for(int x=1;x<=1000;x++){
//if(x%3==2 && x%5==3 && x%7==2){
//	System.out.println(x+"符合要求。");
//}
//  }


	}

}
