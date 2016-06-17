package com.InnerClass;

/**
 * 匿名内部类：不使用class、extends，无构造函数、继承其他类或实现其他接口
 */
import java.util.Date;

public class AnonymousClassTest {
	
	@SuppressWarnings("deprecation")
	public String get(Date date)
	{
		return date.toLocaleString();
	}
	 
	public static void main(String[] args)
	{
		AnonymousClassTest test = new AnonymousClassTest();
		
		//String str = test.get(new Date());;
		
		//System.out.println(str);
		
		String str = test.get(new Date()
		{ 
			public String toLocaleString()
			{
				return "time is " + new Date().toLocaleString();
			}
		});
		
		System.out.println(str);
		
	}
}
