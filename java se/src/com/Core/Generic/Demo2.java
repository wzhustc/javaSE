package com.Core.Generic;

public class Demo2 {
	public static void main(String[] args) {
		InfoImp<String> info = new InfoImp<String>("Hello world");
		System.out.println(info.getVar());
		System.out.println("--------------");
		
		InfoImp<Double> info2 = new InfoImp<Double>(20.3);
		info2.setVar(33.3);
		System.out.println(info2.getVar());
	}
}

interface Info<T> {
	T getVar();
}

class InfoImp<T> implements Info<T> {
	public T var;
	
	public InfoImp(T var) {
		this.var = var;
	}
	
	public void setVar(T var) {
		this.var = var;
	}
	
	public T getVar() {
		return this.var;
	}
}
