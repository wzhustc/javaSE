package com.designpattern.abstractFactoryMethod;

/**
 * /**
 * 具体产品角色类之：奔驰商务车角色
 * @author Administrator
 *
 */
 
public class BenzBusinessCar implements Car {

	@Override
	public void drive() {
		System.out.println("drive BenzBusinessCar!");
	}

}
