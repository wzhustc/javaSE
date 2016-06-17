package com.classLoader;

public class ClassTest {
	public static void main(String[] args) throws Exception {
		Employee em = new Employee();
		
		String str = em.getClass().getName();
		System.out.println(str);
		
		System.out.println("---------------------");
		String className = "java.lang.Object";
		Class clazz = Class.forName(className);
		System.out.println(clazz.getClass().getName());
		System.out.println(clazz);		
	}
}	

class Employee {
	
}
