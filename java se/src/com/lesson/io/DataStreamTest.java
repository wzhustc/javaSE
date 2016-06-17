package com.lesson.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream
				(new FileOutputStream("c:/11.txt")));
		
		int i = 12;
		byte b = 3;
		char c = 'A';
		float f = 3.3f;
		
		dos.writeInt(i);
		dos.writeByte(b);
		dos.writeChar(c);
		dos.writeFloat(f);
		
		dos.close();
		DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("c:/11.txt")));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		
		dis.close();
		
		
	}
}
