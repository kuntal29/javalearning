package com.java.learning;

import java.util.*;
import java.io.*;

public class RevArrayList {

	public static void main(String[] args) {
		// Takes an array list as a parameter and returns
		// a reversed array list
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(10);
		intArray.add(20);
		intArray.add(30);
		intArray.add(40);
		System.out.println(intArray);

		List<String> myList = new ArrayList<String>();
		myList.add("Kuntal");
		myList.add("raj");
		myList.add("kamal");
		myList.add("jain");
		System.out.println(myList);

		Collections.reverse(myList);
		Collections.reverse(intArray);
		System.out.println(intArray);
		System.out.println(myList);
	}

}
