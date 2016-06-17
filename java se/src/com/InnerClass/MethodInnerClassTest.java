package com.InnerClass;

/**
 * 局部内部类：定义在一个代码块内部，作用范围仅限该代码块内部。
 * 弊端：和局部变量一样，其也不可以被各种修饰符修饰。private、public、static、
 * @author Administrator
 *
 */
public class MethodInnerClassTest {
	public static void main(String[] args) {
		MethodInner mi = new MethodInner();
		mi.doSomething();
	}
}

class MethodInner {
	private int a = 3;
	
	public void doSomething() {
//		 private int a = 4;
		//局部内部类定义在一个方法的内部，作用范围也是其所在的代码块，和局部变量一样，其也不可以被各种修饰符修饰。
		//at the begin of MethodInnerClass, there should not have access modifiers
		class Inner {
			int a = 4;
			public void test() {
				int a = 5;
				System.out.println("test Method : " + a);
				System.out.println("Inner Class : " + this.a);
				System.out.println("MethodInner Class : " + MethodInner.this.a);
			}
		}
		new Inner().test();
	}
}