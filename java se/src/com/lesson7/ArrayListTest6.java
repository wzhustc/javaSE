package com.lesson7;

import java.util.ArrayList;
/**
 * 泛型在继承中的应用：
 *   可以通过向上类型转换将子类（这里的A B C D就是apple2的子类）添加到属于父类（apple2）容器中去
 * @author ZhangWei
 *
 */
public class ArrayListTest6 {
	public static void main(String[] args) {
		ArrayList<Apple2> arrayList = new ArrayList<Apple2>();
		arrayList.add(new A());
		arrayList.add(new B());
		arrayList.add(new C());
		arrayList.add(new D());
		
		
		for (Apple2 array : arrayList) {
			System.out.println(array);
		}
	}
}

class Apple2 {
	
}

class A extends Apple2 {
	
}

class B extends Apple2 {
	
}

class C extends Apple2 {
	
}

class D extends Apple2 {
	
}
