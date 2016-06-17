package com.lesson.reflection;

import java.lang.reflect.Method;

public class ReflectionTest2 {
	public int add(int a, int b) {
		return a + b;
	}
	
	public String echo(String message) {
		return "hello : " + message;
	}
	
	public static void main(String[] args) throws Exception, IllegalAccessException {
//		//先获得到类ReflectionTest2的类对象
//		Class<?> classType = ReflectionTest2.class;
//		//通过类对象生成一个类的实例
//		Object obj = classType.newInstance();
//		//再通过类对象获得这个类中的方法对象add的方法，后面是传入的参数列表
//		Method addMethod = classType.getMethod("add", new Class[] {int.class, int.class});
//		//获得到具体方法后再调用invoke方法来调用这个add具体方法,obj是生成的对象，后面是跟的参数列表，用obj来调用add具体方法
//		Object result = addMethod.invoke(obj, new Object[] {1, 2});
//		
//		System.out.println(result);
		
		Class<?> classType = ReflectionTest2.class;
		
		Object test = classType.newInstance();
		
		Method addMethod = classType.getMethod("add", new Class[] {int.class, int.class});
		
		Object result = addMethod.invoke(test, new Object[] {3, 4});
		
		System.out.println((Integer)result);
		
		Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
		
		Object string = echoMethod.invoke(test, new Object[]{"Tom"});
		
		System.out.println((String)string);
		
		
		
		
		
	}
}
