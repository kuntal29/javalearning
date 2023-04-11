package com.java.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionArrayList {

	// Array list examples

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<String> list3 = new ArrayList<String>();
		list1.add(50);
		list1.add(90);
		list1.add(10);
		list3.add("Raj");
		list3.add("Vijay");
		list3.add("Abhay");
		list3.add("kunal");
		System.out.println(list3);
		// Sorting the array
		Collections.sort(list3);
		Collections.sort(list1);
		System.out.println(list3);
		Collections.shuffle(list3);
		System.out.println(list3);
		// Traversing through iterator
		Iterator itr = list3.iterator();
		;// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next()); // printing the element and move to next
		}
		System.out.println(list1);
		for (int i = 0; i <= 5; i++)
			list2.add(i);
		System.out.println(list2);
		
		// for each loop for iterator
		for (String list:list3) {
			System.out.println("Printring using for each loop " + list);
		}
		
		
	}

}
