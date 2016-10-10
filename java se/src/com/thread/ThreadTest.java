package com.thread;

public class ThreadTest extends Thread {
	
	private String name;
	
	public ThreadTest(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("被执行了！！");
	}
	
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("t1");
		t1.start();
		
		Thread t2 = new Thread(){
			public void run() {
				System.out.println("t2 thread is running");
			}
			
		};
		t2.start();
	}
	
	
	
}
