package com.Core.Inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calender = new GregorianCalendar(year, month - 1, day);
		hireDay = calender.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public Date getHireDay() {
		return hireDay;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent;
		salary += raise;
	}
}
