package com.lesson3;

public class PolyTest {

	public static void main(String[] args) {
//		Car car = new Car();
		Car car = new BMW();
		car.run();
	}
}

class Car {
	public void run() {
		System.out.println("car is running");
	}
}

class BMW extends Car{
	
}
