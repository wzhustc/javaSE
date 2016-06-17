package com.lesson5;

public class ObjectTest {
	
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj == obj2);//==号代表的是这两个引用是否指向同一个对象
		System.out.println(obj.equals(obj2));//对于Object类型的equals方法来说等价于==号
		System.out.println("---------------");
		
		String str = new String("aaa");
		String str2 = new String("aaa");
		
		System.out.println(str == str2); //对于String类型的==号,仍然和Object类型的==号代表意思相同
		System.out.println(str.equals(str2));//对于string类型的equals方法，比较的是传进来的字符串内容和当前字符串值是否相等
		System.out.println("----------------");
		
		String str3 = "bbb";
		String str4 = "bbb";
		System.out.println(str3 == str4);//采用字面值进行赋值，字符串池中如果没有bbb对象，就在池中创建一个，返回地址给str3，如果有，就把这个地址给str4，所以这句话为true
		System.out.println(str3.equals(str4));
	}
}
