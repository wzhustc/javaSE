package com.designpattern.factorymethod;

public class Boss {

	public static void main(String[] args) {
		DriverAudi da = new DriverAudi();
		Car car = da.driverCar();
		car.drive();
	}
}
