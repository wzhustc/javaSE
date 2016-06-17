package com.Core.reflection;

public class Person {
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name : " + this.name + ", age : " + this.age + "]";
	}
}
