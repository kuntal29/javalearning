package com.java.learning;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Raj");
		hs.add("kumar");
		hs.add("Raju");
		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Linkedhash set --- remove duplicates
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		Iterator<String> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// Arranged the objects in asecnding order
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("bhanu");
		tree.add("kuntal");
		tree.add("raj");
		tree.add("jain");

		Iterator<String> itr3 = tree.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}

}
