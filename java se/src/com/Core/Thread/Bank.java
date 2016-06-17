package com.Core.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

	private final double[] accounts;
	
	Lock banklock;
	
	Condition sufficientFunds;
	
	public Bank(int n, double initialBalance) {
		accounts = new double[n];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = initialBalance;
		}
		banklock = new ReentrantLock();
		sufficientFunds = banklock.newCondition();
	}
	
	public void transfer(int from, int to, double amount) throws Exception {
		banklock.lock();
		try {
			while (accounts[from] < amount) {
				sufficientFunds.await();
			}
			System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.println("account[from] transfer money : " + amount);
			
			accounts[to] += amount;
			System.out.println("account[to] recieve money : " + amount);
		} finally {
			banklock.unlock();
		}
	}
	
	public double getTotalBalance() {
		banklock.lock();
		try {
			double sum = 0;
			for (double a : accounts) {
				sum += a;
			}
			return sum;
		} finally {
			banklock.unlock();
		}
	}
	
	public int size() {
		return accounts.length;
	}
}
