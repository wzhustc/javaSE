package com.lesson5;

public class InstanceofTest {
	public static void main(String[] args) {
		People p = new People();
		People p1 = new Man();
		System.out.println(p instanceof People);
		System.out.println(p1 instanceof People);
		System.out.println(p1 instanceof Man);
	}
}

class People {
	
}

class Man extends People {
	
}