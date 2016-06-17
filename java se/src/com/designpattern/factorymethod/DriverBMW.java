package com.designpattern.factorymethod;

/**
 * 老司机（抽象工厂类）的开宝马的手下（具体工厂类），他们继承老司机方法
 * @author Administrator
 *
 */
public class DriverBMW implements Driver {

	@Override
	public Car driverCar() {
		return new BMW();
	}

}
