package com.designpattern.abstractFactoryMethod;

/**
 * 具体产品角色类之：奥迪跑车角色
 * @author Administrator
 *
 */
public class AudiSportCar implements Car {

	@Override
	public void drive() {
		System.out.println("drive AudiSportCar!");
	}

}
