package com.lesson4;

public class PolyTest {
	public static void main(String[] args) {
//		Parent parent = new Parent();
//		parent.sing();
//		
//		Child child = new Child();
//		child.sing();
		
		Parent p = new Child();//引用指向哪个对象就调用那个对象的方法
		p.sing();//编译器会先去找parent 有没有sing方法，如果没有,报错，否则，再调用子类的sing方法。
	}
}

class Parent {
	public void sing() {
		System.out.println("parent is singing!");
	}
}

class Child extends Parent {
	
	public void sing() {
		super.sing();  //在子类中调用父类的方法
		System.out.println("child is singing!");
	}
}