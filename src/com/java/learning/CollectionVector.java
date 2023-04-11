package com.java.learning;

import java.util.Iterator;
import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		Vector<Integer> vc1 = new Vector<Integer>();
		vc.add("raj");
		vc.add(null);
		vc.add("kumar");
		vc1.add(2);
		vc1.add(4);
		vc1.add(7);
		System.out.println(vc);
		System.out.println(vc1);
		
		Iterator<String> itr = vc.iterator();
		Iterator<Integer> itr1 = vc1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}


	}

}
