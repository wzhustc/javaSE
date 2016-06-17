package com.lesson4;

public class FinalTest3 {
	final int a;  //在声明final的类型变量时，必须赋初值！
	
	public FinalTest3() {
		a = 10;    //如果在生命时没赋初值，那么在所有构造方法中必须全部赋值
	}
	
	public FinalTest3(int a) {
		this.a = a;  //这也需要赋值
	}
	
}


