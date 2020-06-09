package edu.wlxy.ch04;

public class Student extends Person {
int sno;
int syear;
int abc=2000;
public void exam(){
	System.out.println("网络考试");
}
public void eat(){
	System.out.println(getName()+"吃食堂。");
}
public void eat(int money ){
	System.out.println(getName()+"吃食堂。生活费"+money);
}

public void showInfo(){//重写父类的方法后，屏蔽来 父类的同名方法功能，功能就变化了。
	super.showInfo();//调用父类的方法
	System.out.println("我的学号是"+sno);
}

public Student(String name){
// 方法1  自己编写
//	setName(name);//调用继承过来的方法设置初始值
	
//	方法2  父类的构造方法不能继承，但是可以调用的。
//	利用关键字  super  来表示父类
    super(name);//相当于 Person(name);
}

public Student(String name,int age,int sno ) {
//	super 调用父类构造方法时，必须在方法的第1行。
	super(name,age);//相当于 Person(name,age); 
	this.sno=sno;//this表示本类
}

public Student() {
	
}


}
