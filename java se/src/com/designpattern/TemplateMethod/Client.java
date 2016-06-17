package com.designpattern.TemplateMethod;

public class Client {
	public static void main(String[] args) {
		System.out.println("烧鱼咯！！");
		Meal fish = new Fish();
		fish.cookMeal();
		
		System.out.println("---------------------");
		System.out.println("又香又滑的红烧肉，赶紧烧吧！");
		Meal hongShaoRou = new Meat();
		hongShaoRou.cookMeal();
	}
}
