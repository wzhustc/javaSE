package com.lesson1;

public class LogicTest {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 8;
		
		boolean d = ((a < b) && (a < c));
		System.out.println(d);
		
		boolean e = ((a > b) || (a > c));
		System.out.println(e);
		
		//������Ǽ���·��������
		int m = 1;
		int n = 2;
		int i = 3;
		int j = 4;
		int k = 5;
		int l = 8;
		boolean x = (m < n) && ((k = i) < j);
		boolean y = (m > n) && ((l = i) < j);
		
		System.out.println(x);
		System.out.println(k);//�����ִ�С���˵��û�ж�·
		System.out.println(l);//��������Ϊ8����˵��ǰ��m>nΪ�٣�������ʽ��·��û��ִ��i��ֵ��l�Ĳ���
	}
}
