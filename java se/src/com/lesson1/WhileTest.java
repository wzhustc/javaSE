package com.lesson1;

public class WhileTest {

	public static void main(String[] args) {
		
		//whileѭ��ʵ��1��100�ĺ�
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			sum += a;
			a++;
		}
		System.out.println(sum);
		
		//do...whileѭ�����1+...+100
		int b = 1;
		int sum2 = 0;
		do {
			sum2 += b;
			b++;
		}while(b <= 100);
		
		System.out.println(sum2);

		//forѭ�����1+...+100
		int sum3 = 0;
		for (int i = 0; i <= 100; i++) {
			sum3 += i;
		}
		System.out.println(sum3);
		
		//forѭ�����1��100��ż���ĺ�
		int sum4 = 0;
		for (int i = 0; i <= 100; i+=2) {
			sum4 += i;
		}
		System.out.println(sum4);
	}
}
