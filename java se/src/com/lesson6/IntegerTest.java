package com.lesson6;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		int a = 100;
		Integer integer = new Integer(a);
		int b = integer.intValue();
		System.out.println(a == b);
	}
}
