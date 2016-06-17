package com.Equals;

public class EqualsTest {
	public static void main(String[] args) {
		Employee alice = new Employee("jack", 30000, 1998, 1, 2);
		Employee alice2 = alice;
		Employee alice3 = new Employee("jack", 30000, 1998, 1, 2);
		Employee alice4 = new Employee("world", 200, 2016, 3, 12);
		
		System.out.println("alice == alice2:" + (alice == alice2));
		System.out.println("alice == alice3:" + (alice == alice3));
		System.out.println("------------------------------");
		System.out.println("alice.equals(alice3):" + (alice.equals(alice3)));
		System.out.println("alice.equals(alice4):" + (alice.equals(alice4)));
		
		System.out.println("alices.toString() : " + alice4.toString());
		
		
		Manager boss = new Manager("XIAOMI", 30000, 2009, 12, 1);
		Manager lei = new Manager("XIAOMI", 70000, 2009, 12, 1);
		boss.setBonus(30000);
		System.out.println(boss);
		System.out.println("boss.toString() : " + boss);
		System.out.println("-------------------------------");
		System.out.println("boss.equals(lei) : " + boss.equals(lei));
		System.out.println("-------------------------------");
		System.out.println("alice.hashcode() : " + alice.hashCode());
		System.out.println("alice3.hashcode() : " + alice3.hashCode());
		System.out.println("-------------------------------");
		System.out.println("boss.hashcode() : " + boss.hashCode());
		System.out.println("lei.hashCode() : " + lei.hashCode());
		
	}	
}
