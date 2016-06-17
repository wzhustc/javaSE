package com.lesson1;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
//		System.out.println("Hello, It's:" + new Date());
//		
//		for(int i = 0; i < 10; i++) {
//			new Rock(i);
//		}
		
//		
//		int[] a1 = {1, 2, 3, 4, 5};
//		int[] a2 = a1;
//		for (int i = 0; i < a2.length; i++) {
//			System.out.println(a2[i]);
//		}
		
		int x = 0, y = 0;
		x--;
		y = x++ + ++x;
		System.out.println(y);
		System.out.println(x);
		
		
		Random rand = new Random(47);
		int[] a = new int[rand.nextInt(40)];
		System.out.println("length:" + a.length);
		System.out.println(Arrays.toString(a));
	}
}

class Rock {
	Rock(int i) {
		System.out.println("Rock" + ++i);
	}
}