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
		
		//下面的是检测短路现象的情况
		int m = 1;
		int n = 2;
		int i = 3;
		int j = 4;
		int k = 5;
		int l = 8;
		boolean x = (m < n) && ((k = i) < j);
		boolean y = (m > n) && ((l = i) < j);
		
		System.out.println(x);
		System.out.println(k);//如果他执行。则说明没有短路
		System.out.println(l);//如果他结果为8，这说明前面m>n为假，后面表达式短路，没有执行i赋值给l的操作
	}
}
