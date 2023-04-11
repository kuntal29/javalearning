package com.java.learning;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class RevArrayList {

	public static void main(String[] args) {
		// Takes an array list as a parameter and returns
		// a reversed array list
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(10);
		intArray.add(3);
		intArray.add(35);
		intArray.add(40);
		System.out.println(intArray);
		for (int i = 0; i <= 3; i++)
			if (intArray.indexOf(i) % 2 == 0) {
				System.out.println("Number is even");

			} else {
				System.out.println("Number is odd");
			}

		int arr[] = { 10, 9, 8, 9, 10, 4, 59 };
		for (int n : arr) {
			if (n % 2 == 0) {
				System.out.println("number is even");
			} else {
				System.out.println("number is odd");
			}
			
			int arr2[] = { 10, 9, 8, 9, 10, 4, 59 };
			for (int k : arr) {
			

		}

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
