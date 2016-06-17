package com.Core.reflection;

public class Person2 {
	private String name;
	private int age;
	
	public Person2() {
		
	}
	
	public Person2(String name) {
		this.name = name;
	}
	
	public Person2(int age) {
		this.age = age;
	}
	
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "["+ this.name +  this.age + "]";
	}
}
