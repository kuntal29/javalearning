package com.java.learning;

import java.util.Iterator;
import java.util.Stack;

public class CollectionStack {
	
	// using stack, push is to add and pop is to remove

	public static void main(String[] args) {
		Stack<String> stc = new Stack<String>();
		stc.push("first");
		stc.push("Second");
		stc.push("third");
		stc.pop();
		Iterator<String> itr = stc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
