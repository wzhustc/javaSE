package com.Core.Abstract;

public class PersonTest {
	public static void main(String[] args) {
		Person[] person = new Person[2];
		
		person[0] = new Employee("Jack", 20000);
		person[1] = new Student("Zhangwei", "Software Engnieering");
		
		for (Person p : person) {
			System.out.println(p.getDiscription());
		}
		
		person.equals(person);
	}
}
