package com.lesson6;
/**
 * 程序有问题！
 * @author ZhangWei
 *
 */
public class QuickSortTest {
	public static void quickSort(int[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q, r);
			
			for (int i=0; i<a.length; i++) {
				System.out.println(a[i]);
				
			}
		}
		
	}
	
	public static int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = 0; j <= r - 1; j++) {
			if (a[j] <= x) {
				i = i + 1;
				exchange(a[i], a[j]);
			}
		}
		exchange(a[i+1], a[r]);
		return i + 1;
	}
	
	public static void exchange(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	
	
	public static void main(String[] args) {
		int[] a = new int[]{1, 4, 7, 3, 9, 2};
		quickSort(a, 1, a.length);
		
	}
}
