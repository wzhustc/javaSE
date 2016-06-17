package com.Interface;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public int compareTo(Employee em) {
		return Double.compare(salary, em.salary);
	}

}
