package com.Core.reflection;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Person {
	
	Lock lock = new ReentrantLock();
	
	ConcurrentHashMap chm = new ConcurrentHashMap();
	ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
	
	ArrayList list = new ArrayList();
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name : " + this.name + ", age : " + this.age + "]";
	}
}
