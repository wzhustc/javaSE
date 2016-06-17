package com.lesson4;
/**
 * 静态只能访问静态，非静态都可以访问
 * @author ZhangWei
 *
 */
public class StaticTest5
{
	public static void main(String[] args)
	{
		W w = new W();
		w.change();
	}
}

class W
{
	static int a = 10;

	public static void change()
	{
		a++;
	}
}

