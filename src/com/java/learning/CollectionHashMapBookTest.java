package com.java.learning;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMapBookTest {

	public static void main(String[] args) {
		// Creating map of books (instance)
		Map<Integer, CollectionHashMapBook> map = new HashMap<Integer, CollectionHashMapBook>();
		// Creating books
		CollectionHashMapBook b1 = new CollectionHashMapBook(1, "book1", "Raj", "DC", 2);
		CollectionHashMapBook b2 = new CollectionHashMapBook(2, "book2", "kumar", "Marvel", 2);
		CollectionHashMapBook b3 = new CollectionHashMapBook(2, "book3", "babu", "chandan", 3);
		// for (int i=0; i<= map.hashCode(); i++) {

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		// Traversing map
		try {
			for (Map.Entry<Integer, CollectionHashMapBook> entry : map.entrySet()) {
				int key = entry.getKey();
				CollectionHashMapBook b = entry.getValue();
				System.out.println(key + " Details:");
				System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
			}
		} catch (Exception e) {
			System.out.println("check try");
		}

	}

}
