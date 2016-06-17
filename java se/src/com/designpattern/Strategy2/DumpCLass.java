package com.designpattern.Strategy2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DumpCLass {
	public static void main(String[] args) throws Exception {
		
		Class<?> classType = Class.forName("java.lang.String");
		
		Method[] methods = classType.getDeclaredMethods();
		
		Constructor[] me = classType.getDeclaredConstructors();
		
		
		for (Constructor con : me) {
			System.out.println(con);
		}
		System.out.println("------------------------");
		
		for (Method method : methods) {
			System.out.println(method);
		}
		
	}
}
