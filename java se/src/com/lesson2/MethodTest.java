package com.lesson2;

public class MethodTest {

	public void method() {
		System.out.println("hello, world!");
	}
	
	public void method2(int a) {
		if (a > 1) {
			return;
		}
		System.out.println("你好，我正在学习java se！");
	}
	
	public String Int(int a, int b) {
		if (a > b) {
			return "这是二者中最大的数：" + a;
		} else {
			return "这是二者中最大的数：" + b;
		}
	}
	
	public boolean bool(int a, int b) {
		if (a >= b) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		
		methodTest.method();
		methodTest.method2(3);
		methodTest.method2(0);
		
		System.out.println("-----------------");
		String str = methodTest.Int(3, 8);
		System.out.println(str);
		
		System.out.println("-----------------");
		boolean b = methodTest.bool(3, 5);
		System.out.println(b);
	}
}
