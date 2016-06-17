package com.designpattern.simpleFactory;

import com.designpattern.simpleFactory.Car;

/**
 * 具体产品角色
 * @author Administrator
 *
 */
public class Audi implements Car{

	@Override
	public void drive() {
		System.out.println("Driver Audi Car");
	}
}
