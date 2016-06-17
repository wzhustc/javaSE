package com.lesson3;

/**
 * 构造方法也可以相互调用，调用的时候用this关键字，而且this(i)要放在第一行，表示调用含有一个参数的构造方法
 * @author Administrator
 *
 */
public class ConstructorOverload {
	public ConstructorOverload() {
		this(3);
		System.out.println("test");
	}
	
	public ConstructorOverload(int i) {
		System.out.println(i++);
	}

	public static void main(String[] args) {
		
		ConstructorOverload col = new ConstructorOverload();
	}
}
