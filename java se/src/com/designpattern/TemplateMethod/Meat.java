package com.designpattern.TemplateMethod;

public class Meat extends Meal {

	@Override
	public void cook() {
		System.out.println("红烧肉当然是先把油炸干净点，然后在加上各种作料，我去，肥而不腻！");

	}

	@Override
	public void useTools() {
		System.out.println("红烧肉烧好了直接在锅里吃吧，已经等不及上盘子了！！");

	}

}
