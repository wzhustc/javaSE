package com.lesson7;

class Test2
{
	public static void main(String[] args)
	{
		Node2 node1 = new Node2("node1");
		Node2 node2 = new Node2("node2");
		Node2 node3 = new Node2("node3");
		Node2 node4 = new Node2("node4");

		node1.next = node2;
		node1.prior = node3;
		node2.next = node3;
		node2.prior = node1;
		node3.next = node1;
		node3.prior = node2;

		System.out.println(node1.next.data);
		System.out.println(node2.next.data);
		System.out.println(node3.next.data);

		//插入操作:把node4插入到node1和node2之间
		System.out.println("-------------------------");
		node1.next = node4;
		node4.next = node2;
		node4.prior = node1;
		node2.prior = node4;

		System.out.println(node1.next.data);
		System.out.println(node2.prior.data);
		System.out.println(node4.next.data);
		System.out.println(node4.prior.data);
		
		//删除node4节点
		System.out.println("--------------------------");
		node1.next = node2;
		node2.prior = node1;
		node4.next = null;
		node4.prior = null;

		System.out.println(node1.next.data);
		System.out.println(node2.prior.data);
	
	}
}

class Node2 
{
	public String data;
	Node2 prior;
	Node2 next;

	public Node2(String data)
	{
		this.data = data;
	}
}