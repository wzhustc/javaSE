package com.Core.Inheritance;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Employee boss = new Manager("Jack", 12000, 2012, 3, 5);
		Manager ma = (Manager) boss; //downcast
		System.out.println(ma instanceof Manager);
		ma.setBonus(20000);
		
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Mayun", 2000, 2002, 12, 23));
		staff.add(new Employee("Liyanhong", 2000, 2014, 10, 1));
		staff.add(boss);
		
		System.out.println(ma.getClass().getName() + ", " + ma.getName());
		System.out.println(ma.getClass().getClass().getName());
		System.out.println("----------------");
//		Employee[] staff = new Employee[3];
//		staff[0] = new Employee("Mayun", 2000, 2002, 12, 23);
//		staff[1] = new Employee("Liyanhong", 2000, 2014, 10, 1);
//		staff[2] = boss;
		
		for (Employee e : staff) {
			System.out.println("name : " + e.getName() + ", salary : " + e.getSalary());
		}
	}
}
