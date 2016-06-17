package com.Core.Abstract;

public class Employee extends Person {
	private double salary;	
	
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public String getDiscription() {
		return "this employee salary : " + salary;
//		return String.format("this employee salary is ", salary);
	}
	
}
