package com.lesson1;

public class PpAndMm {

	public static void main(String[] args) {
		int a = 3;
		int b = a ++;//把a的值取出来后赋给b，然后a加1，所以b=3， a=4
		System.out.println(a);
		System.out.println(b);
		int c = ++ a;//把a的值先加1，在赋给c，这样a和c的值都是5
		System.out.println(c);
		
		int i = 1;
		i ++; //i=2
		int j = ++ i;//i=3,j=3
		int m = j ++;//j=4,m=3
		System.out.println("-----------");
		System.out.println(i); //i的值是3
		System.out.println(j);//j的值是4
		System.out.println(m);//m的值是3
		
		
		int x = (1 < 6)? 3 : 4;
		System.out.println(x);
	}
}
