package com.lesson9;

public class InnerClassTest {
	public static void main(String[] args) {
		InnerClass.Inner inner = new InnerClass.Inner();
		inner.test();
	}
}

class InnerClass {
	private static int i = 4;
	
	public static class Inner {
		public void test() {
			System.out.println(i);
		}
	}
}
