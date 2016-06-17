package com.lesson1;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person(50);
		
		System.out.println(person.age);
	}
}

class Person {
	int age = 30;
	
	public Person(int i) {
		age = i;
	}
}