package com.designpattern.proxy;

public class ProxySubject extends Subject {

	private RealSubject realSubject;
	
	@Override
	public void request() {
		this.preCost();
		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		realSubject.request();
		this.postCost();
	}
	
	
	private void preCost() {
		System.out.println("房屋租好前的费用");
	}
	
	private void postCost() {
		System.out.println("房屋租好后的费用");
	}
	
}
