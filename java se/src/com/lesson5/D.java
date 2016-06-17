package com.lesson5;

public class D extends C {
	public static void output() {
		System.out.println("d extends c invoked");
	}
	
	public static void main(String[] args) {
		D d = new D();
		D.output();
		System.out.println(d.year);
		
		C c = new C();
		System.out.println(c.year);
		C.output();
	}
}
