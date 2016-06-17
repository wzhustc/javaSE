package com.Core.Generic;

public class Demo3 {
	public static void main(String[] args) {
		Point1 p = new Point1();
		
		p.setX(10);
		p.setY(22.2);
		
		int x = (Integer) p.getX();
		double y = (Double) p.getY();
		
		System.out.println(x + ", " + y);
		
		
	}
}

class Point1<T1, T2> {
	T1 x;
	T2 y;
	public T1 getX() {
		return x;
	}
	public void setX(T1 x) {
		this.x = x;
	}
	public T2 getY() {
		return y;
	}
	public void setY(T2 y) {
		this.y = y;
	}
	
	
}