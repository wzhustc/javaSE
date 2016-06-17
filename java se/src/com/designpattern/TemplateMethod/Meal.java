package com.designpattern.TemplateMethod;

public abstract class Meal {
	//模板方法，决定了算法的骨架，相当于TemplateMethod()方法
	public void cookMeal() {
		this.buy();
		this.wash();
		this.split();
		if (hookMethod()) {
			this.cook();
			this.useTools();
		}
	}
	
	//共性的操作，直接在抽象类中定义
	public void buy() {
		System.out.println("买菜回来烧好吃的");
	}
	
	//共性的操作，直接在抽象类中定义
	public void wash() {
		System.out.println("买完菜就打浪菜");
	}
	
	//共性的操作，直接在抽象类中定义
	public void split() {
		System.out.println("菜需要切开");
	}
	
	// 钩子方法，决定某些算法步骤是否挂钩在算法中
	public boolean hookMethod() {
		return true;
	}
	
	// 特殊的操作，需要在子类中具体实现
	public abstract void cook();
	
	// 特殊的操作，需要在子类中具体实现
	public abstract void useTools();
}
