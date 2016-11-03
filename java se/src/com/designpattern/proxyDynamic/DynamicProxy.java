package com.designpattern.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	
	private Object subject;
	
	public DynamicProxy(Object subject) {
		this.subject = subject;
	}
	
	
	//重写InvocationHandler类的invoke方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before rent house");
		
		System.out.println("Methods : " + method);
		
		method.invoke(subject, args);
		
		System.out.println("after rent house");
		
		return null;
	}
	
}
