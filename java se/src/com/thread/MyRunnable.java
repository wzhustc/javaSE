package com.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("实现runnable接口的线程");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable());
		System.out.println(thread.currentThread().getName());
		thread.start();
		
		Runnable myRunnable = new Runnable(){

			@Override
			public void run() {
				System.out.println("使用匿名内部类实现的runnable接口");
			}
			
		};
		Thread thread2 = new Thread(myRunnable, "新线程");
		thread2.start();
		System.out.println(thread2.getName());
	}
}
