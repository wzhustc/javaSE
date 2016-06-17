package com.designpattern.Singleton;

public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingelton();
		
		Singleton sinleton2 = Singleton.getSingelton();
		
		System.out.println(singleton == sinleton2);
		
	}
}
