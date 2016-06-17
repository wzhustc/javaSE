package com.Core;

import java.util.logging.Logger;

public class StaticTest {
	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		
		e[0] = new Employee("Jack", 2000.3);
		e[1] = new Employee("Mark", 3000.4);
		e[2] = new Employee("Tom", 4000.5);
		
		for (Employee em : e) {
			em.setId();
			System.out.println("name:" + em.getName() +", id :" +em.getId() + ", salary:" + em.getSalary());
		}
		System.out.println("nextId available is " + Employee.getNextId());
		
		System.out.println("=======================");
		Logger.getGlobal().info("name : ");
	}
}


class Employee {
	public static int nextId;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setId() {
		id = nextId;
		nextId++;
	}
	
	public static int getNextId() {
		return nextId;
	}
	
	public int getId() {
		return id;
	}
}