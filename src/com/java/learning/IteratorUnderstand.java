package com.java.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorUnderstand {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		
		list.add("Kuntal");
		list.add("Java");
		list.add("learn");
		list.add("any how");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(list.size());
				
		list1.add("new");
		list1.add("test");
		list1.add("learn");
		list1.add("practice");
		System.out.println(list1);
		
		String[] str1 = {"raj", "kumar", "jain"};
		
		for (String str2 : list1){
			System.out.println(str2);
		}
		
	}
	

}
