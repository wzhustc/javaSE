package com.designpattern.abstractFactoryMethod;

/**
 * 测试类：有一个具体工厂（比如这里是开跑车的具体工厂）的实例，
 * 具体工厂实例调用开跑车工厂中的哪辆跑车（这里是奥迪跑车）
 * @author Administrator
 *
 */
public class Boss {
	public static void main(String[] args) {
		Driver driver = new DriverSportCar();
		Car car = driver.driverAudi();
		car.drive();
		
		Driver driver2 = new DriverBusinessCar();
		Car car2 = driver2.driverBenz();
		car2.drive();
	}
}
