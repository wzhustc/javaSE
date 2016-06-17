package com.lesson6;

public class BubbleSortTest {
	public static void bubbleSort(int[] a) {
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=0; j<a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println("第" +(i+1) + "趟排序");
			for (int k=0; k<a.length; k++) {
				System.out.print(a[k] +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{3, 6, 9, 1, 7, 4};
		
		bubbleSort(a);
	}
}
