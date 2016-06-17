package com.lesson1;

public class BreakTest {

	public static void main(String[] args) {
		for (int i = 0; i <=9; i++) {
			if (5 == i) {
				break;  //跳出所有循环，执行循环下面的代码
			}
			System.out.println(i);
		}
		System.out.println("--------------");
		for (int i = 0; i <= 9; i++) {
			if (i <= 6 && i >=3) {
				continue;  //跳出本次循环，执行下次循环
			}
			System.out.println(i);
		}
	}
	
}
