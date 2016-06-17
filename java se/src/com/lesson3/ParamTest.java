package com.lesson3;

public class ParamTest {
	public void change(Point p) {
		p = new Point();
		p.x = 3;
		p.y = 4;
	}
	
	public static void main(String[] args) {
		ParamTest pt = new ParamTest();
		Point point = new Point();
		
		System.out.println(point.x);
		System.out.println(point.y);
		
		pt.change(point);
		System.out.println("-------------------");
		System.out.println(point.x);
		System.out.println(point.y);
	}
}

class Point {
	int x;
	int y;
}
