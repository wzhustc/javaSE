package com.Core.reflection;

public class ReflectionTest {
	public static void main(String[] args) {
		Class<?> demo = null;
		
		try {
			demo = Class.forName("com.Core.reflection.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Person person = null;
		
		try {
			person = (Person) demo.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		person.setName("Rollen");
		person.setAge(20);
		
		System.out.println(person.toString());
	}
	
}

