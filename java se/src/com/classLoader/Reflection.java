package com.classLoader;

public class Reflection {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("Demo");
		System.out.println(clazz.getClass().getName());
	}
}

class Demo {
	
}
