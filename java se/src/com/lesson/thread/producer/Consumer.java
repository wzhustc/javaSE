package com.lesson.thread.producer;

public class Consumer extends Thread {
	private Base base;
	private int neednum;
	
	public Consumer(Base base, int neednum) {
		this.base = base;
		this.neednum = neednum;
	}
	
	@Override
	public void run() {
		base.consume(neednum);
	}
}
