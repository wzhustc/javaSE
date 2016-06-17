package com.lesson7;

class Test
{
	public static void main(String[] args)
	{
		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");
		Node node4 = new Node("node4");

		node1.next = node2;
		node2.next = node3;
		node1.next = node4;
		node4.next = node2;
		node1.next = node2;
		node4.next = null;

		System.out.println(node1.next.data);
	}
}

class Node
{
	public String data;
	public Node next;

	public Node(String data) 
	{
		this.data = data;
	}
}