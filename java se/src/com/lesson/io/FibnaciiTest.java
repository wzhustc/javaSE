package com.lesson.io;

import java.util.Scanner;

public class FibnaciiTest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			int n = in.nextInt();
			int result = Fib(n);
			System.out.println(result);
		}
	}
	
	public static int Fib(int n) 
	{
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return Fib(n - 1) + Fib(n -2);
		}
	}
}
