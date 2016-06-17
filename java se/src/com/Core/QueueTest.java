package com.Core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueueTest {
	public static void main(String[] args) {
		List queue = new ArrayList();
		queue.add("hello");
		queue.add("world");
		queue.add("welcome");
		queue.add("ahah");
		
		System.out.println(queue);
		
		queue.remove(0);
		System.out.println(queue);
		
		System.out.println(queue.size());
		int index = queue.indexOf("ahah");
		System.out.println(index);
		System.out.println(queue.isEmpty());
		System.out.println(queue.contains("hello"));
		System.out.println(queue.get(0));
//		queue.clear();
		System.out.println(queue);
		Object[] obj = queue.toArray();
		System.out.println(obj);
		
		for (Iterator iter = queue.iterator(); iter.hasNext();){
		String str = (String) iter.next();
		System.out.print(str + ", ");
		}
	}

}
