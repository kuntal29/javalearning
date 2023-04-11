package com.java.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class CollectionHashMap {

	public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Aman");
		map.put(101, "Rahul");
		map.put(102, "kunal");
		map.put(103, "Tmama");
		System.out.println(map);
		// Traversing Map
		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
