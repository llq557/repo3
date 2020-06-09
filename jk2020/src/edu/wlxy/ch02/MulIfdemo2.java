package edu.wlxy.ch02;
/*
 * 我想买车，买什么车决定于我在银行有多少存款
如果我的存款超过500万，我就买凯迪拉克
否则，如果我的存款超过100万，我就买帕萨特
否则， 如果我的存款超过50万，我就买依兰特
否则， 如果我的存款超过10万，我就买奥托
否则， 如果我的存款10万以下 ，我买捷安特

 * 
 */
public class MulIfdemo2 {

	public static void main(String[] args) {
		int money = 780; // 我的存款，单位（万元）
//		if (money >= 500) {
//			System.out.println("太好了，我可以买凯迪拉克");
//		} else if (money >= 100) {
//			System.out.println("不错，我可以买辆帕萨特");
//		}else if (money >= 50) {
//			System.out.println("我可以买辆依兰特");
//		}  else if (money >= 10) {
//			System.out.println("至少我可以买个奥托");
//		} else  if (money < 10){
//			System.out.println("看来，我只能买个捷安特了");
//		}

		
	

		if (money < 10){
			System.out.println("看来，我只能买个捷安特了");
		} else if (money <50 ) {
			System.out.println("至少我可以买个奥托");
		} else if (money <100) {
			System.out.println("我可以买辆依兰特");
		}else if (money <500) {
			System.out.println("不错，我可以买辆帕萨特");
		}else if (money >= 500) {
			System.out.println("太好了，我可以买凯迪拉克");
		}
		
	}

}
