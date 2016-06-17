package com.lesson4;

public class StaticTest3 {
	public static void main(String[] args) {
		M m = new N();
		m.output();
	}
}

class M {
	public void output() {
		System.out.println("output");
	}
}

class N extends M {
	public void output() {
		System.out.println("out");
	}
}