package com.lesson4;

public class StaticTest {
	public static void main(String[] args) {
		StaticTest test = new StaticTest();
		AA aa = new AA();
		aa.a = 20;
		System.out.println(aa.a);
		System.out.println("------------");
		System.out.println(AA.a);
		
		BB.method();
	}
}

class AA {
	static int a;
}

class BB {
	public static void method() {
		System.out.println("output");
	}
}
