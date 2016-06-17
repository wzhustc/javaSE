package com.lesson3;
/**
 * 这里的run方法重写了，子类与父类的方法返回类型一样，方法名一样，参数一样，则子类与父类构成重写关系
 * @author Administrator
 *
 */
public class InheritenceTest2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.run();
	}
}

class Animal {
	public void run() {
		System.out.println("the animal is running");
	}
}

class Dog extends Animal {
	
	@Override
	public void run() {
		System.out.println("the dog is running");
	}
	
	public void run(int i) {
		super.run();//用super.run表示调用父类的run方法，这里可以不放在第一行，因为是普通方法的调用
		System.out.println("the dog is running");
	}
}
