package com.designpattern.abstractFactoryMethod;

/**
 * 抽象工厂类：抽象工厂方法的核心类，定义开奥迪和宝马车行为，但是不管是跑车还是商务车
 * @author Administrator
 *
 */
public interface Driver {
	
	public Car driverAudi();
	
	public Car driverBenz();
}
