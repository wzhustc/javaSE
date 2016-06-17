package com.designpattern.Adapter;

public class Adapter extends Adaptee implements Target {
	
	@Override
	public void sampleOperation1() {
		System.out.println("我是一个中间适配器，我能连接三相的插头和两相的插座。");
	}
	
	@Override
	public void sampleOperation2() {
		System.out.println("我是三相的插头，我需要三相的插座");
		
	}
}
