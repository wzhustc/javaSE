package com.designpattern.abstractFactoryMethod;

/**
 * 具体工厂角色之：开商务车工厂
 * @author Administrator
 *
 */
public class DriverBusinessCar implements Driver {

	@Override
	public Car driverAudi() {
		return new AudiBusinessCar();
	}

	@Override
	public Car driverBenz() {
		return new BenzBusinessCar();
	}

}
