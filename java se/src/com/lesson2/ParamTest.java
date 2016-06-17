package com.lesson2;

public class ParamTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.change(person);
		int age = person.age;
		System.out.println(age);
		
		
	}
}

class Person {
	int age = 20;
	
	public void change(Person person) {
		person.age = 30;
		
	}
}
