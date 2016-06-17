package com.Core.reflection;

public class Person3 implements China {

	private String sex;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void sayChina() {
		System.out.println("Hello, China");

	}

	@Override
	public void sayHello(String name, int age) {
		System.out.println("name : " + this.name + ", age:" + this.age + "Say Hello to China");

	}

}
