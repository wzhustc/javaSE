package com.lesson6;

public class Swap2 {
	public static void Swap(int[] i) {
		int temp = i[0];
		i[0] = i[1];
		i[1] = temp;
	}
	
	public static void main(String[] args) {
		int[] i = {1, 2};
		Swap2.Swap(i);
		System.out.println(i[0]);
		System.out.println(i[1]);
		
	}
}
