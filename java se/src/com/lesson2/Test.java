package com.lesson2;

public class Test {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int substract(int a,int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public void method(int a) {
		if (a < 10) {
			return;
		} else {
			System.out.println("Hello World");
		}
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		int x = 9;
		int y = 3;
		int a = test.add(x, y);
		int b = test.substract(x, y);
		int c = test.multiply(x, y);
		int d = test.divide(x, y);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int m = 5;
		int n = 12;
		
		test.method(m);
		test.method(n);
		
	}
}
