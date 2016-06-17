package com.classLoader;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = in.next();
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		System.out.println("So, What's your favorite sports?");
		String sport = in.next();
		
		System.out.println("So, " + name + ", you are " + age + 
				" years old, and your favorite sports is " + sport);
	}
}
