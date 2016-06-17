package com.lesson3;

/**
 * super 可以调用父类的带参数的构造方法，而且super要放在第一行，用super显示地调用父类构造方法，super（i），会找父类的带参数的构造方法
 * @author Administrator
 *
 */
public class Child extends Parent {
	public static void main(String[] args) {
		Child child = new Child();
	}
	public Child() {
		super(8);
		System.out.println("child");
	}
	
}

class Parent {
//	public Parent() {
//		System.out.println("parent");
//	}
	
	public Parent(int i) {
		System.out.println("parent------");
	}
}
