package com.designpattern.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {

		System.out.println("房屋出租啦！！！");
	}

}
