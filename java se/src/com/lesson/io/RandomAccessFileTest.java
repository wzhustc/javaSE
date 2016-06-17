package com.lesson.io;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
		
		Person p = new Person(1, "hello", 4.22);
		
		p.write(raf);
		
		Person p2 = new Person();
		
		raf.seek(0);
		
		p2.read(raf);
		
		System.out.println(p2.getId() + ", " + p2.getName() + ", " 
		+ p2.getHeight());
		
	}
}

class Person {
	int id;
	String name;
	double height;
	
	public Person() {}
	
	public Person(int id, String name, double height) {
		this.id = id;
		this.name = name;
		this.height = height;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public void write(RandomAccessFile raf) throws Exception {
		raf.writeInt(this.id);
		raf.writeUTF(this.name);
		raf.writeDouble(this.height);
		
	}
	
	public void read(RandomAccessFile raf) throws Exception {
		this.id = raf.readInt();
		this.name = raf.readUTF();
		this.height = raf.readDouble();
	}
	
}
