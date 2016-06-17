package com.Core;

import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("choose one Enter SMALL, MEDIUM, LARGE, EXTRA_LARGER");
		String input = in.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size = " + size);
		System.out.println("abbreviation = " + size.getAbbreviation());
		
		if (size == Size.EXTRA_LARGER) {
			System.out.println("Good job--you paid attention to the _.");
		}
	}
}

enum Size {
	SMALL("S"), MEDIUM("M"), LARGER("L"), EXTRA_LARGER("XL");
	
	private String abbreviation;

	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}
}
