package com.lesson8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		Hashtable ht = new Hashtable();
		
		map.put(1, "zhangsan");
		map.put("b", "lisi");
		map.put(3, "wangwu");
		map.put(4, "zhaoliu");
		
		String value = (String) map.get("b");
		System.out.println(value);
		System.out.println(map);
		
		System.out.println(map.get(5));
	}
}
