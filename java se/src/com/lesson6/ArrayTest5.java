package com.lesson6;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		System.out.println(a[0] instanceof int[]);
		
		int m = 0;
		for(int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				m++;
				a[i][j] = 2 * m;
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();
		}
	}
}
