package com.lesson4;

public class PolyTest2 {
	public static void main(String[] args) {
		
		//向上类型转换：子类型->父类型
		Dog dog = new Dog();
		Animal animal = dog;
		animal.sing();  //dog is singing
		
		//向下类型转换：父类型->子类型：必须强制类型转换
		Animal a = new Dog();
		Dog c = (Dog)a;
		c.sing();  //dog is singing 

		System.out.println("-----------------");
		Animal aa = new Dog();
		Dog ad = (Dog)aa;
		ad.run();
	}

}

class Animal {
	public void sing() {
		System.out.println("Animal is singing!");
	}
}

class Dog extends Animal {
	public void sing() {
		System.out.println("Dog is singing");
	}
	
	public void run() {
		System.out.println("dog is running");
	}

}
