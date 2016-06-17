package com.Core.reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest2 {
	public static void main(String[] args) {
		Class<?> demo = null;
		
		try {
			demo = Class.forName("com.Core.reflection.Person2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Person2 per1 = null;
		Person2 per2 = null;
		Person2 per3 = null;
		Person2 per4 = null;
		
		Constructor<?>[] con = demo.getConstructors();
		try {
			per4 = (Person2) con[3].newInstance("Rollen", 20);
			per3 = (Person2) con[2].newInstance(20);
			per2 = (Person2) con[1].newInstance("Rollen");
			per1 = (Person2) con[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(per1.toString());
		System.out.println(per2.toString());
		System.out.println(per3.toString());
		System.out.println(per4.toString());
	}
}
