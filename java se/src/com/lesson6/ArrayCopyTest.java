package com.lesson6;

public class ArrayCopyTest {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4};
		int[] b = new int[4];
		System.arraycopy(a, 0, b, 0, 4);
		for (int i=0; i<4; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
