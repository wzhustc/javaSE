package com.classLoader;

import java.util.Scanner;
import java.lang.Math;


public class AttackTest {
	static int hurt = 0;
	
	public static void main(String[] args) {
		
		
		System.out.println("请输入攻击距离R和三个炮台的坐标x1, y1, x2, y2, x3, y3");
		Scanner in = new Scanner(System.in);
		
		double R = in.nextInt();
		double x1 = in.nextInt();
		double y1 = in.nextInt();
		double x2 = in.nextInt();
		double y2 = in.nextInt();
		double x3 = in.nextInt();
		double y3 = in.nextInt();
		
		System.out.println("请输入敌人的坐标x0, y0:");
		
		double x0 = in.nextInt();
		double y0 = in.nextInt();
		
		injure(x1, y1, x0, y0, R);
		injure(x2, y2, x0, y0, R);
		injure(x3, y3, x0, y0, R);
		
		System.out.println("总共受到的伤害是：" + hurt + "X");
		
	}
	
	public static int injure(double x, double y, double x0, double y0, double r) {
		if (Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2)) <= r) {
			hurt++;
		}
		return hurt;
	}
	
}
