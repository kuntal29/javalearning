package com.java.learning;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionQueue {

	// Priority queue -- can not have nulll values

	public static void main(String[] args) {
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("Amit sharma");
		qu.add("Raj kumar");
		qu.add("kumar visvas");
		System.out.println(qu);
		
		System.out.println("head:"+qu.element());  
		System.out.println("head:"+qu.peek());  
		System.out.println("iterating the queue elements:");
		Iterator itr = qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		qu.remove();
		qu.poll();  
		System.out.println(qu);

	}

}
