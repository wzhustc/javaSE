package com.lesson5;
/**
 * 单例模式的
 * @author ZhangWei
 *
 */
public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.singleton();
		Singleton singleton2 = Singleton.singleton();
		
		System.out.println(singleton == singleton2);
	}
}

class Singleton {
	//这里的static是因为下面用的是static，这样下面的静态方法必须要访问静态的实例。所以这里的实例也必须是静态的
	private static Singleton singleton;
	//构造方法必须是private
	private Singleton() {
		
	}
	//下面的static是单例模式下可以让外部的类来访问此类的此方法返回的值。 
	public static Singleton singleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
