package com.Core.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AllReflectionTest {
	public static void main(String[] args) throws Exception {
		Class<?> demo = Class.forName("com.Core.reflection.Person3");
		
		System.out.println("======================本类所有属性====================");
		
		//取得所有的属性
		Field[] field = demo.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			//取得属性的修饰符
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			//属性的类型
			Class<?> type = field[i].getType();
			System.out.println("属性修饰符" + priv + ", " + "，属性类型：" + type.getName() + ", " + "域名：" + field[i].getName());
		}
		System.out.println();
		System.out.println("======================父类属性和接口======================");
		
		Field[] field1 = demo.getFields();
		for (int i = 0; i < field1.length; i++) {
			int mod = field1[i].getModifiers();
			String pri = Modifier.toString(mod);
			
			Class<?> sutype = field1[i].getType();
			System.out.println("属性修饰符" + pri + ", " + "，属性类型：" + sutype.getName() + ", " + "域名：" + field1[i].getName());
		}
		System.out.println();
		System.out.println("=====================本类的方法==========================");
		
		Method[] method = demo.getDeclaredMethods();
		
		for (int i = 0; i < method.length; i++) {
			int mome = method[i].getModifiers();
			String prime = Modifier.toString(mome);
			
			Class<?> typeme = method[i].getReturnType();
			
			System.out.println("修饰符" + prime + ", " + "，返回值类型：" + typeme.getName() + ", " + "方法名：" + method[i].getName());
		}
		
		Constructor<?>[] consu = demo.getDeclaredConstructors();
		for (int i = 0; i < consu.length; i++) {
			int modicon = consu[i].getModifiers();
			String primesucon = Modifier.toString(modicon);
			
			Class<?> typesucon = consu[i].getClass();
			
			System.out.println("修饰符" + primesucon + ", " + "，返回值类型：" + typesucon.getName() + ", " + "方法名：" + consu[i].getName());
		}
		
		System.out.println();
		System.out.println("=====================父类的方法==========================");
		
		Class<?> cl = Class.forName("com.Core.reflection.China");
		
		Method[] methodsu = cl.getDeclaredMethods();
		for (int i = 0; i < methodsu.length; i++) {
			int modi = methodsu[i].getModifiers();
			String primesu = Modifier.toString(modi);
			
			Class<?> typesu = methodsu[i].getReturnType();
			
			System.out.println("修饰符" + primesu + ", " + "，返回值类型：" + typesu.getName() + ", " + "方法名：" + methodsu[i].getName());
		}
		

		//通过反射操作属性
		Object obj = null;
		obj = demo.newInstance();
		
		Field fieldprivate = demo.getDeclaredField("sex");
		fieldprivate.setAccessible(true);
		fieldprivate.set(obj, "男");
		System.out.println(fieldprivate.get(obj));
		
		int[] temp = {1, 2, 3, 4, 5};
		
		Class<?> clazz = temp.getClass().getComponentType();
		
		System.out.println("数组类型：" + clazz.getName());
		System.out.println("数组长度：" + Array.getLength(temp));
		System.out.println("数组第一个元素：" + Array.getInt(temp, 0));
		Array.set(temp, 0, 100);
		System.out.println("现在数组第一个元素：" + Array.getInt(temp, 0));
		
		
		
	}
}
