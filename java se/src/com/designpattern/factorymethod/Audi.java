package com.designpattern.factorymethod;

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
