package com.lesson1;

public class Variable2 {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println(a - b);
		System.out.println(a + b);
		System.out.println(a * b);
		
		System.out.println(b / a);
		System.out.println(a / b);
		
		double c = 1.0;
		System.out.println(c / b);
		System.out.println((double) a / b);
		/**
		 * 下面两个数的取模说明取模后的结果和被除数的符合是一致的
		 */
		int i = 3;
		int j = -5;
		System.out.println("取模后为：" + j % i);
		
		int m = -3;
		int n = 5;
		System.out.println("取模后为:" + n % m);
	}
}
