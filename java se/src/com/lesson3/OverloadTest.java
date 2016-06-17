package com.lesson3;

public class OverloadTest {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		OverloadTest ol = new OverloadTest();
		int result = ol.add(3, 4);
		int result2 = ol.add(3,  4, 5);
		System.out.println(result);
		System.out.println(result2);
	}
	
}

