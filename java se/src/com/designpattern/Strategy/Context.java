package com.designpattern.Strategy;
/**
 * 环境角色类
 * @author ZhangWei
 *
 */
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void operate() {
		strategy.strategy();
	}
}
