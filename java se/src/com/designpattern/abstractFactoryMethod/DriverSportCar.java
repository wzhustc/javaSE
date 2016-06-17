package com.designpattern.abstractFactoryMethod;

/**
 * 具体工厂角色之：开跑车工厂。
 * @author Administrator
 *
 */
public class DriverSportCar implements Driver {

	@Override
	public Car driverAudi() {
		return new AudiSportCar();
	}

	@Override
	public Car driverBenz() {
		return new BenzSportCar();
	}

}
