package com.lesson6;

public class ArrayTest4 {
	public static void main(String[] args) {
		
		int [][] a = new int[2][3];
		int m = 0;
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				m ++;
				a[i][j] = 2 * m;
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		int [][] b = new int [3][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[1];
		int [][] c = new int [][]{{1, 2, 3},{4},{5, 6,}};
		for (int i=0; i< c.length; i++) {
			for (int j=0; j<c[i].length;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
