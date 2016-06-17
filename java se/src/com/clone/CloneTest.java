package com.clone;

public class CloneTest {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setAge(22);
		s1.setName("haha");
		
		Student s2 = (Student)s1.clone();
		
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		
		s2.setAge(33);
		s2.setName("hehe");
		System.out.println(s2.getAge() + " ," +s2.getName());
	}
}

class Student implements Cloneable{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object obj =  super.clone();
		return obj;
	}
	
}
