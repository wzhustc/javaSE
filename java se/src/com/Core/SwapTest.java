package com.Core;

public class SwapTest {
	public static void main(String[] args) {
		Employee2 ee = new Employee2("Jack", 22);
		Employee2 eee = new Employee2("Mark", 12);
		
		System.out.println("Before: ee = " + ee.getName());
		System.out.println("Before: eee = " + eee.getName());
	
		swap(ee, eee);
		
		System.out.println("After: ee = " + ee.getName());
		System.out.println("After: eee = " + eee.getName());
	}
	
	public static void swap(Employee2 x, Employee2 y) {
		Employee2 temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("End of method:x =  " + x.getName());
		System.out.println("End of method:y = " + y.getName());
		
	}
}

class Employee2 {
	
	private String name;
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private int age;
	
	public Employee2() {
	}
	
	public Employee2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}