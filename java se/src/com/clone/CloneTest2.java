package com.clone;

public class CloneTest2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student1 s1 = new Student1();
		s1.setAge(22);
		s1.setName("zhangsan");
		
		Teacher teacher = new Teacher();
		teacher.setAge(40);
		teacher.setName("Teacher zhang");
		s1.setTeacher(teacher);
		
		System.out.println(s1.getName()+ " ," + s1.getAge() 
		+ " ,"+ s1.getTeacher().getName() + ", " + s1.getTeacher().getAge());
		
		
		Student1 s2 = (Student1)s1.clone();
		System.out.println(s2.getName() +" ," + s2.getAge() 
		+ ", " + s2.getTeacher().getName() + ", " + s2.getTeacher().getAge());
		System.out.println("-------------------------");
		
		s2.setTeacher(teacher);
		teacher.setAge(50);
		teacher.setName("Teacher li");
		
		System.out.println(s2.getName() +" ," + s2.getAge() 
		+ ", " + s2.getTeacher().getName() + ", " + s2.getTeacher().getAge());
		
		System.out.println( s1.getTeacher().getName() + ", " + s1.getTeacher().getAge());
		
	}
	
}

class Student1 implements Cloneable {
	private int age;
	private String name;
	private Teacher teacher;
	
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Student1 st1 = (Student1)super.clone();
		
		st1.setTeacher((Teacher)st1.getTeacher().clone());
		
		return st1;
	}
}

class Teacher implements Cloneable {
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
	
	public Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		
		return object;
	}
	
}
