package com.lesson6;
/**
 * 原生数据类型传值之后是不会改变原来的值的，而数组类型传引用，通过引用改变数组的值。所以A->D,而
 * P值永远是P,不会被改成了O
 * @author ZhangWei
 *
 */
public class Swap3 {
	public static void swap(char[] ch, char c) {
		ch[0] = 'D';
		c = 'O';
	}
	
	public static void main(String[] args) {
		char[] ch = {'A', 'F'};
		char c = 'P';
		Swap3.swap(ch, c);
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
	}
}
