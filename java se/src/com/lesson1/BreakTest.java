package com.lesson1;

public class BreakTest {

	public static void main(String[] args) {
		for (int i = 0; i <=9; i++) {
			if (5 == i) {
				break;  //��������ѭ����ִ��ѭ������Ĵ���
			}
			System.out.println(i);
		}
		System.out.println("--------------");
		for (int i = 0; i <= 9; i++) {
			if (i <= 6 && i >=3) {
				continue;  //��������ѭ����ִ���´�ѭ��
			}
			System.out.println(i);
		}
	}
	
}
