package com.lesson4;
/**
 * 这个程序说明向下类型转换时不需要显式写出转换类型，相反，向上类型转换则需要写出转换为什么类型
 * @author ZhangWei
 *
 */
public class PolyTest5 {
	public static void main(String[] args) {
		Fruit f = new Pear();
		
		//f是fruit类型的引用，f指向Pear类型的内存，
		f.run();
		//f.grow();//在程序执行时，会先看f自己所属的类型fruit有没有那个run/grow方法，没有则报错，有则再调用子类的run方法
		
		
		System.out.println("--------------");
		Pear p = (Pear)f;
		p.run();
		p.grow();
	}
}

class Fruit {
	public void run() {
		System.out.println("fruit is running");
	}
}
 
class Pear extends Fruit {
	public void run() {
		System.out.println("Pear is running");
	}
	public void grow() {
		System.out.println("pear is growing");
	}
}
