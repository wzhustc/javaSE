package com.lesson.thread;

public class ThreadTest5 {

	public static void main(String[] args) {
		Example example = new Example();
		Thread t1 = new TheThread(example);
		example = new Example();
		Thread t2 = new TheThread2(example);
		t1.start();
		t2.start();
	}
}

class Example2 {
	private Object object = new Object();
	//synchronized是给对象上锁的。当只有一个对象时，线程先访问了一个synchronized之后，其他线程就无法访问这个对象的任何一个synchronized方法了，
	public void execute() {
		
		synchronized(object) {
			for (int i = 0; i < 30; i++) {
				
				try {
					Thread.sleep((long)(Math.random() * 400));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Example :" + i);
			}
		}
		
	}
	
	public void execute2() {
		synchronized(object) {
			for (int i = 0; i < 30; i++) {
			
			try {
				Thread.sleep((long)(Math.random() * 400));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("LALALALALA :" + i);
		}
		}
		
	}
}

class TheThread6 extends Thread {
	private Example example;
	
	public TheThread6(Example example) {
		this.example = example;
	}
	
	@Override
	public void run() {
		example.execute();
	}
}

class TheThread7 extends Thread {
	private Example example;
	
	public TheThread7(Example example) {
		this.example = example;
	}
	
	@Override
	public void run() {
		example.execute2();
	}
}