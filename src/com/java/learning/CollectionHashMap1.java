package com.java.learning;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash =  new HashMap<Integer,String>();
		hash.put(1, "one");
		hash.put(2, "two");
		hash.put(3, "three");
		hash.put(4, "four");
		System.out.println("Hashmap iteration");
		for(Map.Entry m : hash.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		hash.replace(3, "THREE");
		for(Map.Entry m : hash.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		

	}

}
