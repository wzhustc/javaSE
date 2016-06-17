package com.designpattern.Strategy2;
/**
 * 策略模式的测试类
 * @author ZhangWei
 *
 */
public class Client {
	public static void main(String[] args) {
		AddStrategy addStrategy = new AddStrategy();
		
		Environment environment = new Environment(addStrategy);
		
		System.out.println(environment.calculate(4, 4));
		
		SubStrategy subStrategy = new SubStrategy();
		
		environment.setStrategy(subStrategy);
		
		System.out.println(environment.calculate(4, 4));
		
		MulStrategy mulStrategy = new MulStrategy();
		
		environment.setStrategy(mulStrategy);
		
		System.out.println(environment.calculate(4, 4));
		
		DivStrategy divStrategy = new DivStrategy();
		
		environment.setStrategy(divStrategy);
		
		System.out.println(environment.calculate(4, 4));
	}
}	
