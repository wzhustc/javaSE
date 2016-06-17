package com.designpattern.Strategy2;
/**
 * 策略模式的环境类
 * @author ZhangWei
 *
 */
public class Environment {
	
	private Strategy strategy;
	
	public Environment(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int calculate(int a, int b) {
		
		return strategy.calculate(a, b);
	}
}
