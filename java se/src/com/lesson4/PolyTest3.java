package com.lesson4;
/**
 * 这个程序说明了多态是晚绑定的，是在编译的时候才知道会生成什么对象
 * @author ZhangWei
 *
 */
class PolyTest3
{
	static A a = null;
	public static void main(String[] args)
	{
		if(args[0].equals("1"))
		{
			A a = new B();
			
		}
		else if (args[0].equals("2"))
		{
			A a = new C();
			
		}
		else if(args[0].equals("3"))
		{
			A a = new D();
			
		}
		a.method();
	}
}

class A {
	public void method() {
		System.out.println("A");
		
	}
}
class B extends A
{
	@Override
	public void method()
	{
		System.out.println("B");
	}

}

class C extends A
{
	public void method()
	{
		System.out.println("C");
	}
}

class D extends A
{
	public void method()
	{
		System.out.println("D");
	}
}
