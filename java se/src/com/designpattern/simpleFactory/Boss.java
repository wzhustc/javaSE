package com.designpattern.simpleFactory;

/**
 * 测试类
 * @author Administrator
 *
 */
public class Boss {

	public static void main(String[] args) {
		
		Car car  = Driver.driverCar("Benz");
		car.drive();
	}
}
