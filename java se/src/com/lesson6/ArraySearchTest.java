package com.lesson6;

public class ArraySearchTest {
	/**
	 * 遍历数组来查找元素的值，时间复杂度是O（n）
	 * @param a
	 * @param value
	 * @return
	 */
	public static int search(int[] a, int value) {
		for (int i=0; i<a.length; i++) {
			if (value == a[i]) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 二分查找法来查找元素的值，时间复杂度是O（lgn）
	 * @param a
	 * @param value
	 * @return
	 */
	public static int binarySearch(int[] a, int value) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;
			if (a[middle] == value) {
				return middle;
			}
			if (a[middle] < value) {
				low = low + 1;
			}
			if (a[middle] > value) {
				high = high - 1;
			}
		}
		return -1;
	}
	
	/**
	 * 利用冒泡算法对数组进行排序，为二分查找做铺垫
	 * @param a
	 */
	public static void bubbleSort (int[] a) {
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
		
		int[] b = new int[]{3, 4, 8, 1, 5, 9, 6};
		
		bubbleSort(b);
		int value = 5;
		int index = binarySearch(b, value);
		System.out.println("---------------------");
		System.out.println("元素" + value + "的位置为：" + index);
	}
}
