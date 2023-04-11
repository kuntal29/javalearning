package com.java.learning;

import java.util.*;



public class CollectionLinkedList {
	
	// Linked list examples 
	
	public static void main(String args[]) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("kumar");
		list1.add("123");
		list1.add("raj");
		Collections.sort(list1);
		Iterator<String> itr = list1.iterator(); // to traverse and iterate
		while(itr.hasNext()) {
			System.out.println(itr.next());  
		}
		LinkedList<String> list4 =new LinkedList<String>();  
		list4.add("umar");
		list4.add("shanu");
		list4.add("lala");
		list4.add("tina");
		System.out.println(list4);
		Iterator i=list4.descendingIterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

}
