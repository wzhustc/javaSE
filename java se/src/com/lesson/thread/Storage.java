package com.lesson.thread;

import java.util.LinkedList;

public class Storage {
	private final int MAX_SIZE = 100;
	
	private LinkedList<Object> list = new LinkedList<Object>();
	
	public void produce(int num) {
		
		synchronized (list) {
			while (list.size() + num > MAX_SIZE) {
				
				System.out.println("生产的产品数量:" + num + "---- 库存：" + list.size() + "暂时不能生产更多产品");

				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for (int i = 0; i < num; i++) {
				list.add(new Object());
			}		
			
			System.out.println("已经生产的数量：" + num + "----- 库存量：" + list.size());
			list.notify();		
		}
	}
	
	public void consume(int num) {
		
		synchronized (list) {
			while (list.size() < num) {
				System.out.println("消费的产品数量:" + num + "---- 库存：" + list.size() + "暂时不能消费更多产品");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		
		for (int i = 0; i < list.size(); i++) {
			list.remove();
		}
		
		System.out.println("已经消费的数量：" + num + "----- 库存量：" + list.size());
		list.notify();
		}
	}

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

	public int getMAX_SIZE() {
		return MAX_SIZE;
	}
}