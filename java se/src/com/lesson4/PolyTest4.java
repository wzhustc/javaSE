package com.lesson4;

public class PolyTest4 {
	/*
	public void run(BMW bmw) {
		bmw.run();
	}
	public void run(QQ qq) {
		qq.run();
	}
	*/
	//多态的使用，就是无论子类有多少，只要都继承自car，就可以用一个父类型的引用就行
	public void run(Car car) {
		car.run();
	}
	public static void main(String[] args) {
		/*
		PolyTest4 test = new PolyTest4();
		BMW bmw = new BMW();
		test.run(bmw);
		QQ qq = new QQ();
		test.run(qq);
		*/
		PolyTest4 test = new PolyTest4();
		Car car = new BMW();
		test.run(car);
		Car car1 = new QQ();
		test.run(car1);
		
		Car benz = new Benz();
		benz.run();
	}
}

class Car {
	public void run() {
		System.out.println("car is running");
	}
}

class BMW extends Car {
	public void run() {
		System.out.println("BMW is running");
	}
}

class QQ extends Car {
	public void run() {
		System.out.println("QQ is running");
	}
}

class Benz extends Car {
	public void run() {
		System.out.println("benz is running");
	}
}