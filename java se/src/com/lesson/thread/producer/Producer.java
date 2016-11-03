package com.lesson.thread.producer;

public class Producer extends Thread {
	private Base base;
	private int neednum;
	
	public Producer(Base base, int neednum) {
		this.base = base;
		this.neednum = neednum;
	}
	
	@Override
	public void run() {
		base.produce(neednum);
	}
}
