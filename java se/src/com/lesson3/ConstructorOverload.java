package com.lesson3;

/**
 * ���췽��Ҳ�����໥���ã����õ�ʱ����this�ؼ��֣�����this(i)Ҫ���ڵ�һ�У���ʾ���ú���һ�������Ĺ��췽��
 * @author Administrator
 *
 */
public class ConstructorOverload {
	public ConstructorOverload() {
		this(3);
		System.out.println("test");
	}
	
	public ConstructorOverload(int i) {
		System.out.println(i++);
	}

	public static void main(String[] args) {
		
		ConstructorOverload col = new ConstructorOverload();
	}
}
