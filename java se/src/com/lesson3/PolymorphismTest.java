package com.lesson3;

public class PolymorphismTest {
	public static void main(String[] args) {
//		Base b = new Base();
//		b.funA();
//		b = new Derived();
//		b.funA();
		PolymorphismTest t = new Derived();
		t.funA();
		t.funB();
	}
	
	private void funA() {
		System.out.println("qqqqqqqqq");
	}
	
	private void funB() {
		System.out.println("asdfads");
	}
	
}

class Base {
	public Base() {
		
	}
	
	private void funA() {
		System.out.println("Base A class");
	}
	
	public void funB() {
		System.out.println("Base B class");
	}
}

class Derived extends PolymorphismTest {
	public void funA() {
		System.out.println("Derived A class");
	}
	
	public void funB() {
		System.out.println("Derived B class");
	}
}
