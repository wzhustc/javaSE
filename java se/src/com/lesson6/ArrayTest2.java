package com.lesson6;

public class ArrayTest2 {
	public static void main(String[] args) {
		Person[] person = new Person[4];
		
		person[0] = new Person(10);
		for (int i=0; i<person.length;i++) {
			person[i] = new Person(i+19);
			System.out.println(person[i].age);
		}
	}
}

class Person {
	int age;
	
	public Person(int age) {
		this.age = age;
	}
}