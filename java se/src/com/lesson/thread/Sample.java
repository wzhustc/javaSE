package com.lesson.thread;

public class Sample {
	private int number;

	public synchronized void increase() {
		while (0 != number) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;

		System.out.println(number);

		notify();
	}

	public synchronized void decrease() {
		while (0 == number) {
			try {
				wait(); // 如果一个线程执行wait后，则这个线程会释放锁，给其他线程，进入block状态
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number--;

		System.out.println(number);

		notify();// 同时wait()和notify()方法要放置在synchronized方法或者块中
	}
}
