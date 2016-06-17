package com.designpattern.Singleton;

public class Singleton {
	public static Singleton singelton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingelton() {
		return singelton;
	}
}
