package com.designpattern.factorymethod;

/**
 * 老司机（抽象工厂类）的开奔驰的手下（具体工厂类），他们继承老司机方法
 * @author Administrator
 *
 */
public class DriverBenz  implements Driver{

	@Override
	public Car driverCar() {
		return new Benz();
	}

}
