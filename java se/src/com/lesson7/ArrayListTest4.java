package com.lesson7;

import java.util.ArrayList;
/**
 * 
 * @author ZhangWei
 *
 */
public class ArrayListTest4 {
	
	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(2, 3));
		list.add(new Point(0, 4));
		list.add(new Point(3, 6));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((list.get(i)).toString());
			
		}
		System.out.println(list.toString());
	}
}

class Point {
	int x;
	int y;
	/**
	 * 
	 * @param x coordinate of x
	 * @param y coordinate of y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * return coordinate of axis of x and y
	 */
	@Override
	public String toString() {
		return "x=" + this.x + ", y=" + this.y;
	}
}
