package com.designpattern.Singleton;

public class SingletonTest {
	private static  SingletonTest singleton = null;
	
	private SingletonTest() {}
	
	public static SingletonTest getInstance() {
		if (singleton == null) {
			//保证线程安全
			synchronized (SingletonTest.class) {
				if (singleton == null) {
					singleton = new SingletonTest();
				}
			}
		}
		return singleton;
	}
}
