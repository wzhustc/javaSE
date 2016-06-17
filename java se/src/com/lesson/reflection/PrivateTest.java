package com.lesson.reflection;

import java.lang.reflect.Field;

public class PrivateTest {
	public static void main(String[] args) throws Exception {
		
		//生成对象
		Private2 p2 = new Private2();
		//获得对象的Class对象
		Class<?> classType = p2.getClass();
		//获得Class对象的Field对象
		Field field = classType.getDeclaredField("name");
		//想访问private的域需要设置下面语句
		field.setAccessible(true);
		//重新设置field的值
		field.set(p2,  "lisi");
		//调用getName打印出name
		System.out.println(p2.getName());
		
	}
}
