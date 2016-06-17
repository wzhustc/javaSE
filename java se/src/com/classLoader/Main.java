package com.classLoader;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入怪物数量n");
		int n = in.nextInt();
		if (n >= 100000 || n < 1) {
			System.out.println("输入的怪物数量有错，请重新输入");
			 n = in.nextInt();
		}
		System.out.println("请输入小易初始能量值a");
		int a = in.nextInt();		
		
		System.out.println("输入每个怪物的能力值");
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
			System.out.println("怪物" + (i+1) + "能力值是：" + array[i]);
		}
		
		for (int i = 0; i< n; i++) {
			a = a + fight(a, array[i]);
		}
		System.out.println("最终技能值：" + a);
		
	}
	
	public static int maxYS(int i, int j) {
		while (i % j != 0) {
			int temp = i % j;
			i = j;
			j = temp;
		}
		return j;
	}
	
	public static int fight(int nowAbility, int MonsterAbility) {
		if (nowAbility >= MonsterAbility) {
			return MonsterAbility;
		} else {
			return maxYS(nowAbility, MonsterAbility);
		}
	
	}
	
}
