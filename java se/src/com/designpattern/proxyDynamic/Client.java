package com.designpattern.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		
		Subject realSubject = new RealSubject();
		
		//Proxy.newProxyInstance(参数1, 参数2, 参数3)第3个参数 handler
		InvocationHandler handler = new DynamicProxy(realSubject);

		//Proxy.newProxyInstance(参数1, 参数2, 参数3)第一个参数 loader = handler.getClass().getClassLoader()
		ClassLoader loader = handler.getClass().getClassLoader();
		
		//Proxy.newProxyInstance(参数1, 参数2, 参数3)第二个参数realSubject.getClass().getInterfaces()
		Class<?>[] interfaces = loader.getClass().getInterfaces();
		
		/*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
		Subject subject = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);
		
		System.out.println(subject.getClass().getName());
		
		subject.rentHouse();
		
		subject.sayHello("world");
	
	}
}
