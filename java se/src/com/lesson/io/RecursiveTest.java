package com.lesson.io;

public class RecursiveTest {

	public static void main(String[] args) {
		int n = 5;
		int result = compute(n);

		System.out.println(result);
	}

	public static int compute(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * compute(n - 1);
		}
	}
}
