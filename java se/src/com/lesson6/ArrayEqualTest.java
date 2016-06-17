package com.lesson6;

import java.util.Arrays;

/**
 * 判断两个数组是否一致
 * @author ZhangWei
 *
 */
public class ArrayEqualTest {
	public static boolean isEquals(int[] a , int[] b) {
		if (a == null && b == null) {
			return false;
		}
		if (a.length != b.length) {
			return false;
		}
		for (int i=0; i<a.length; i++) {
			if (a[i] == b[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		int[] b = new int[] {1, 2, 3};
		int[] c = new int[] {1};
		boolean be = isEquals(a, b);
		boolean bol = isEquals(a, c);
		System.out.println(be);
		System.out.println(bol);
		System.out.println("-------------");
		System.out.println("下面是Api自带的equals方法");
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		
	}
}
