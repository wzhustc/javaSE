package com.lesson3;

/**
 * super ���Ե��ø���Ĵ������Ĺ��췽��������superҪ���ڵ�һ�У���super��ʾ�ص��ø��๹�췽����super��i�������Ҹ���Ĵ������Ĺ��췽��
 * @author Administrator
 *
 */
public class Child extends Parent {
	public static void main(String[] args) {
		Child child = new Child();
	}
	public Child() {
		super(8);
		System.out.println("child");
	}
	
}

class Parent {
//	public Parent() {
//		System.out.println("parent");
//	}
	
	public Parent(int i) {
		System.out.println("parent------");
	}
}
