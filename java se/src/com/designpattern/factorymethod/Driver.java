package com.designpattern.factorymethod;

/**
 * 老司机已经变成了一个抽象工厂类了，手下有几个人手（具体）工厂类可以分配
 * @author Administrator
 *
 */
public interface Driver {
	public Car driverCar();
}
