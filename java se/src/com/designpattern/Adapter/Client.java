package com.designpattern.Adapter;

public class Client {
	public static void main(String[] args) {
		new Client().test();
		
	}
	
	public void test() {
		System.out.println("测试是否可以满足两个不同操作");
		Target t = new Adapter();
		t.sampleOperation1();
		t.sampleOperation2();
	}
	
	
}
