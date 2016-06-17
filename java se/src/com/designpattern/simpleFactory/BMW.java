package com.designpattern.simpleFactory;

/**
 * 具体产品角色
 * @author Administrator
 *
 */
public class BMW implements Car{

	@Override
	public void drive() {

		System.out.println("Driver BMW Car");
	}
}
