package com.lesson1;

public class PpAndMm {

	public static void main(String[] args) {
		int a = 3;
		int b = a ++;//��a��ֵȡ�����󸳸�b��Ȼ��a��1������b=3�� a=4
		System.out.println(a);
		System.out.println(b);
		int c = ++ a;//��a��ֵ�ȼ�1���ڸ���c������a��c��ֵ����5
		System.out.println(c);
		
		int i = 1;
		i ++; //i=2
		int j = ++ i;//i=3,j=3
		int m = j ++;//j=4,m=3
		System.out.println("-----------");
		System.out.println(i); //i��ֵ��3
		System.out.println(j);//j��ֵ��4
		System.out.println(m);//m��ֵ��3
		
		
		int x = (1 < 6)? 3 : 4;
		System.out.println(x);
	}
}
