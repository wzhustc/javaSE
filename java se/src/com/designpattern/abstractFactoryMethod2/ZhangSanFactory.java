package com.designpattern.abstractFactoryMethod2;

public class ZhangSanFactory implements AbstractFactory {

	@Override
	public Fish cookFish() {
		Fish fish =  new ZhangSanHotelFish();
		fish.cook();
		return fish;
	}

	@Override
	public Meat cookMeat() {
		Meat meat = new ZhangSanHotelMeat();
		meat.cook();
		return meat;
	}
}
