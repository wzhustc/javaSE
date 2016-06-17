package com.designpattern.Strategy2;
/**
 * 策略模式的具体策略类3
 * @author ZhangWei
 *
 */
public class MulStrategy implements Strategy {
	
	public int calculate(int a, int b) {
		return a * b;
	}
}
