package com.lesson.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest1 implements Callable<Object> {

	public static void main(String[] args) throws Exception {
		
		ThreadTest1 tt = new ThreadTest1();
		FutureTask<Object> ft = new FutureTask<>(tt);
		
		for (int i = 0; i < 20; i++) {
			Thread.sleep((long) (Math.random() * 1000));
			System.out.println(Thread.currentThread().getName() + " : " + i);
			if (i == 10) {
				new Thread(ft,"what").start();
			}
		}
	}
	
	
	
	@Override
	public Object call() throws Exception {
		for (int i = 0; i < 9; i++) {
			Thread.sleep((long) (Math.random() * 1000));
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		return null;
	}

}
