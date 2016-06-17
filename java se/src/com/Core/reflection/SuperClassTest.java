package com.Core.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SuperClassTest {
	public static void main(String[] args) throws Exception {
		Class<?> demo = null;
		
		demo = Class.forName("com.Core.reflection.Person3");
		
		Class<?> sucl= demo.getSuperclass();
		
		System.out.println(sucl.getName());
		
		System.out.println("-------------------------------");
		
		Class<?> cl = null;
		
		cl = Class.forName("com.Core.reflection.Person2");
		
		Constructor<?>[] con = cl.getConstructors();
		Constructor<?>[] cons = cl.getDeclaredConstructors();
		
		for (int i = 0; i < cons.length; i++) {
			System.out.println("declared Constructor : " + cons[i].getName()) ;
		}
		
		for (int i = 0; i < con.length; i++) {
			Class<?>[] coty = con[i].getParameterTypes();
			System.out.println("Constructor : ");
			int mo = con[i].getModifiers();
			System.out.print(Modifier.toString(mo));
			System.out.print(con[i].getName());
			System.out.print("(");
			for (int j = 0; j < con.length; i++) {
				System.out.print(con[j].getName() +" args" + i);
				if (j < con.length -1) {
					System.out.print(",");
				}
			}
			
		}
		
		System.out.println("---------------------------------");
		
		Method[] method = cl.getMethods();
		
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i].getName());
		}
		
		Person3 p = new Person3();
		
		System.out.println("AppClassLoader : " + p.getClass().getClassLoader().getClass().getName());
		
		
		
		
		
		
		
	}
}
