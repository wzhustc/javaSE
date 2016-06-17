package com.lesson5;

public class SingletonTest2 {
	public static void main(String[] args) {
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton2 singleton3 = Singleton2.getInstance();
		System.out.println(singleton2 == singleton3);
	}
}

class Singleton2 {
	
	private static Singleton2 singleton2;
	
	private Singleton2() {
		
	}
	/**
	 * 为什么这里需要static
	 * 因为构造方法是私有的，外部无法new实例，无法new实例就无法生成对象，无法生成对象就无法调用getInstance方法
	 * 因此这里加static，可以让外部不使用实例，而直接用类名.的方式来调用getIntance方法
	 * @return
	 */
	public static Singleton2 getInstance() {
		if (singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
