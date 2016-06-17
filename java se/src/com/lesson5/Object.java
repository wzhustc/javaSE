package com.lesson5;

public class Object {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		F student = new F();
		System.out.println(student);
		System.out.println(student.toString());
	
	}
}

class F {
	public String toString() {
		return "Hello World";
	}
}
