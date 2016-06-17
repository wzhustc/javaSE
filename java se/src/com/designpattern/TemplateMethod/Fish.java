package com.designpattern.TemplateMethod;

public class Fish extends Meal {

	@Override
	public void cook() {
		System.out.println("清炖鱼汤，鱼肉很嫩，好鲜美的汤和鱼啊！");
		
	}

	@Override
	public void useTools() {
		System.out.println("鱼汤要用汤盆来盛，然后喝他一大盆，爽！");
		
	}

}
