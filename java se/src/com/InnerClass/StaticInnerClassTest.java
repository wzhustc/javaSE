package com.InnerClass;

/**
 * 静态内部类：不依赖外部类实例而被实例化，
 * 弊端：因为其本身是静态的，所以只能调用外部类的静态的属性和方法。
 * 构造：生成内部类时是：外部类.内部类的方式
 * @author Administrator
 *
 */
public class StaticInnerClassTest {

	public static void main(String[] args) {
		//new Outer.Inner()
		Outer.Inner in = new Outer.Inner();
		in.doSomething();
	}
}

class Outer {
	private static int a = 3;
	
	public static class Inner {
		public void doSomething() {
			System.out.println(a);
			doSome();
		}
	}
	
	public static void doSome() {
		System.out.println("haha");
	}
}
