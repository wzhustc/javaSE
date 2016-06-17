package com.designpattern.abstractFactoryMethod;

/**
 * 具体产品角色类之：奔驰跑车角色
 * @author Administrator
 *
 */
public class BenzSportCar implements Car {

	@Override
	public void drive() {
		System.out.println("drive BenzSportCar!");
	}

}
