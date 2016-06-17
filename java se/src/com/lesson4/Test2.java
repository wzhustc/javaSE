package com.lesson4;

public class Test2 {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.output();
		myClass.output2();
	}
}

interface MyInterface {
	void output();
}

interface MyInterface2 {
	void output2();
}

class MyClass implements MyInterface1, MyInterface2 {
	public void output() {
		System.out.println("output");
	}
	
	public void output2() {
		System.out.println("output2");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}