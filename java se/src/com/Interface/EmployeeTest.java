package com.Interface;

import java.util.Arrays;


public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		
		employee[0] = new Employee("Jack", 2000);
		employee[1] = new Employee("Edward", 30000);
		employee[2] = new Employee("zhangwei", 4000);
		
		Arrays.sort(employee);
		
		for (Employee e : employee) {
			System.out.println("salary order by :" + e.getSalary() + 
					", name : " + e.getName());
		}
	}
}
