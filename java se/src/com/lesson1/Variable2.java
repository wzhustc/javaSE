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
		 * ������������ȡģ˵��ȡģ��Ľ���ͱ������ķ�����һ�µ�
		 */
		int i = 3;
		int j = -5;
		System.out.println("ȡģ��Ϊ��" + j % i);
		
		int m = -3;
		int n = 5;
		System.out.println("ȡģ��Ϊ:" + n % m);
	}
}
