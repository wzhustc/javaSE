package com.lesson.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardInputStreamTest {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		while (null != (str = br.readLine())) {
			System.out.println(str);
//			str = br.readLine();
		}
		
		br.close();
	}
}
