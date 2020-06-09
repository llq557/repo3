package edu.wlxy.ch04;
// 在Chinese 的country  前 添加或不添加 static  ，观察 ch1  和  ch2   输出结果的变化
//static 全局变量 的含义
public class ChineseTest {

	public static void main(String[] args) {
		// 静态方法，静态变量，可以直接通过 ：   类名.静态方法     类名.静态变量  使用
		System.out.println("直接使用类来使用："+Chinese.country);
		Chinese.sing();
		
     	Math.sqrt(45);
     	Math.random();
		   System.out.println("++++++++++++++++++++");
		Chinese ch1=new Chinese();
		
		System.out.println("通过实例对象来使用："+ch1.country);
		ch1.singOurCountry();
        ch1.sing();
        System.out.println("+++值更改之后++++");
		ch1.country="中国";  //改变country的值
          ch1.singOurCountry();
          ch1.sing();
          
          System.out.println("-----");
          Chinese ch2=new Chinese();
        // ch2.country="大中国";
          ch2.singOurCountry();  //
          ch2.sing();
          System.out.println("-----");
          
          ch1.sing();
	}

}
