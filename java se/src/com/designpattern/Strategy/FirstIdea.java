package com.designpattern.Strategy;
/**
 * 具体策略类
 * @author ZhangWei
 *
 */
public class FirstIdea implements Strategy {

	@Override
	public void strategy() {
		System.out.println("吴国太 速速来救刘备，避免被孙权所杀！");
	}
	
}
