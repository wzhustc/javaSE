package com.lesson.thread;

public class ThreadIncrease extends Thread {
	
	private Sample2 sample2;
	
	public ThreadIncrease(Sample2 sample2) {
		this.sample2 = sample2;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sample2.increase();			
		}
	}
}
