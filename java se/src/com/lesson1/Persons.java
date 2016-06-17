package com.lesson1;

public class Persons {

	public String name;
	public int age;
	public double height;
	
	public String run() {
		return "the person is running";
	}
	
	public void eat() {
		System.out.println("the person is eating!");
	}
	
	public static void main(String[] args) {
		Persons persons = new Persons();
		
		System.out.println("age:" + persons.age);
		System.out.println("height:" + persons.height);
		System.out.println("name:" + persons.name);
		System.out.println(persons.run());
		persons.eat();
	}
	
}
