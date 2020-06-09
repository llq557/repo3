package edu.wlxy.ch02;

public class MulIfExec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int money=90;
        double zhekou=1;
        
		String  huiyuan="n";
		
		//  ==  用于数字比较是否相等
//		   equals  用于比较字符串是否相等
		
		if(huiyuan.equals("y")){
			System.out.println("会员专区");
			if(money>200){
				zhekou=0.75;
			}else{
				zhekou=0.8;
			}
		}else{
			System.out.println("非会员专区");
			if(money>=100){
				zhekou=0.9;
			}
				
		}
		
		System.out.println("你要付款："+money*zhekou);
		
		
		
		
		
	}

}
