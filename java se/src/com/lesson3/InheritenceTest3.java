package com.lesson3;

public class InheritenceTest3 {

	public static void main(String[] args) {
//		InheritenceTest3 i3 = new InheritenceTest3();
		Son son = new Son();
	}
}

class Grandpa {
	static {
		System.out.println("Grapnda static");
	}
	public Grandpa() {
		System.out.println("Grandpa");
	}
}

class Farther extends Grandpa {
	static {
		System.out.println("father static");
	}
	public Farther() {
		System.out.println("Farther");
	}
}

class Son extends Farther {
	static {
		System.out.println("son static");
	}
	public Son() {
		System.out.println("Son");
	}
}
