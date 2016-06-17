package com.Core.Generic;

public class Demo {

	public static void main(String[] args) {
		Point<Integer, Integer> p = new Point<Integer, Integer>();
		
		p.setX(20);
		p.setY(30);
//		System.out.println("( " + p.getX() + ", " + p.getY() + " )");
		Point.printXY(p.getX(), p.getY());
		System.out.println("---------------------");
		
		Point<Double, String> p1 = new Point<Double, String>();
		
		p1.setX(23.22);
		p1.setY("东经30度");
		
		Point.printXY(p1.getX(), p1.getY());
//		System.out.println("(" + p1.getX() + ", " + p1.getY() + " )");
		System.out.println("---------------------");
		Point<String, String> p3 = new Point<String, String>();
		
		p3.setX("11点钟方向");
		p3.setY("2点钟方向");
		Point.printXY(p3.getX(), p3.getY());
//		System.out.println("( " + p3.getX() + ", " + p3.getY() + " )");
		
	}
}

class Point<T1, T2> {
	T1 x;
	T2 y;
	
	public void setX(T1 x) {
		this.x = x;
	}
	
	public T1 getX() {
		return x;
	}
	
	public void setY(T2 y) {
		this.y = y;
	}
	
	public T2 getY() {
		return y;
	}
	
	public static <T1, T2> void printXY(T1 x, T2 y) {
		T1 m = x;
		T2 n = y;
		System.out.println("( " + m + ", " + n + " )");
	}
}