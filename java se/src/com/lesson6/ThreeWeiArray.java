package com.lesson6;

public class ThreeWeiArray {
	public static void main(String[] args) {
		int[][][] a = new int[2][3][4];
		
		System.out.println(a instanceof int[][][]);
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				for (int k=0; k<a[i][j].length; k++) {
					a[i][j][k] = 22;
					System.out.print(a[i][j][k] +" ");
				}
				System.out.println();
			}
		}
	}
}
