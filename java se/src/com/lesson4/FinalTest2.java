package com.lesson4;

public class FinalTest2 {

}

class G {
//	public final void method() {  //final修饰的方法不能被继承
//		System.out.println("G");
//	}
}

class H extends G {
	public void method() {
		System.out.println("H");
	}
}
