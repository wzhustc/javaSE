package com.Core.Abstract;

public class Student extends Person {
	private String major;
	
	public String getMajor() {
		return major;
	}
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	public String getDiscription() {
		return "Student major : " + major;
		//		return String.format("this is a Student whose major is:", major);
	}
}
