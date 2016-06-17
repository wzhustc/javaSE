package com.designpattern.Singleton;

public class Singleton2 {
	private static Singleton2 singleton2 = null;
	 
	private Singleton2() {
		
	}
	
	public static Singleton2 getInstance() {
		if (singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
