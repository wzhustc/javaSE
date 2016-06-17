package com.designpattern.simpleFactory;

/**
 * 工厂方法类：简单工厂模式的核心
 * 
 */
public class Driver {
	
	public static Car driverCar(String str) {
		
		if ("Benz".equals(str)) {
			return new Benz();
		} else if ("Audi".equals(str)) {
			return new Audi();
		} else {
			return new BMW();
		}
	}
}
