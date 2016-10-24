package com.lesson.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
	
	public static void main(String[] args) throws Exception {
		
		Class<?> classType = Class.forName("java.lang.Reflection");
		
		Method[] methods = classType.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		Constructor[] con = classType.getConstructors();
		
		for (Constructor cons : con) {
			System.out.println(cons);
		}
	}

}
