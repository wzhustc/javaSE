package com.designpattern.abstractFactoryMethod2;

public class LiSiFactory implements AbstractFactory {

	@Override
	public Fish cookFish() {
		Fish fish = new LiSiHotelFish();
		fish.cook();
		return fish;
	}

	@Override
	public Meat cookMeat() {
		Meat meat = new LiSiHotelMeat();
		meat.cook();
		return meat;
	}
}
