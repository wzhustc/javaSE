package com.InnerClass;
/**
 * 成员内部类，是非静态的内部类，故可以任意访问外部的属性和方法，但是不能定义静态的属性和方法！
 * @author Administrator
 *
 */
public class MemberInnerClassTest {
	public static void main(String[] args) {
		//new Outer().new Inner()
		MemeberClass.Inner in = new MemeberClass().new Inner();
		in.doSomething();
	}
}

class MemeberClass {
	private  int a = 3;
	
	public class Inner {
		public void doSomething() {
			//成员内部类可以任意访问外部的属性和方法，但是它与一个实例绑定在一起。不能定义静态的属性和方法！！
			System.out.println(a);
		}
	}
}
