package com.lesson6;
/**
 * 数组的初始化方式1， 2， 3
 * @author ZhangWei
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] a = new int[4];
		
		for (int i=0; i<a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		System.out.println("-----------------");
		
		int[] b = {1, 2, 3, 4};
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("-------------------");
		
		int[] c = new int[]{5, 6, 7, 8};
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("----------------");
		
		int [] d = new int[4];
		System.out.println(d[0]);
		
		System.out.println("----------------");
		
		int[] e = {1, 2, 3};
		int[] f = {1, 2, 3};
		System.out.println(e.equals(f));
	}
	
	
	
}
