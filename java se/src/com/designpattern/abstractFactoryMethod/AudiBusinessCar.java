package com.designpattern.abstractFactoryMethod;

/**
 * 具体产品角色类之：奥迪商务车角色
 * @author Administrator
 *
 */
public class AudiBusinessCar implements Car {

	@Override
	public void drive() {
		System.out.println("drive AudiBusinessCar!");
	}

}
