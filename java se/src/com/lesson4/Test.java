package com.lesson4;

class Test {
	public static void main(String[] args) {
		Shape shape = new Triangle(3, 4);
		int area = shape.ComputeArea();
		System.out.println("Triangle:" +area);
		
		shape = new Rectangle(3, 4);
		area = shape.ComputeArea();
		System.out.println("Rectangle:" + area);
	}
}

abstract class Shape {
	public abstract int ComputeArea();
}

class Triangle extends Shape {
	int width;
	int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int ComputeArea() {
		return width * height / 2;
	}
}

class Rectangle extends Shape {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int ComputeArea() {
		return width * height;
	}
}
