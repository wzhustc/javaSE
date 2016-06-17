package com.designpattern.Strategy2;
/**
 * 策略模式的具体策略类1
 * @author ZhangWei
 *
 */
public class AddStrategy implements Strategy {
	
	public int calculate(int a, int b) {
		return a + b;
	}
}
