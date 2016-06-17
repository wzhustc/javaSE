package com.lesson6;

public class ArrayTest3 {
	public static void main(String[] args) {
		Student[] student = new Student[10];
		
		for (int i=0; i<student.length;i++) {
			student[i] = new Student();
			
			String name = i % 2 == 0 ? "zhangsan" : "lisi";
		
			System.out.println(name);
		}
	}
}

class Student {
	String name;
}