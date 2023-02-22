package com.java.learning;

import java.util.*;

public class JavaCollection {

	public static void main(String[] args) {

		ArrayList<Integer> intArr = new ArrayList<Integer>();

		// Integer adding
		intArr.add(100);
		intArr.add(50);
		intArr.add(10);
		intArr.add(20);
		intArr.add(300);
		intArr.add(200);
		intArr.add(null);
		System.out.println(intArr);
		if (intArr.contains(500)) {
			System.out.println("Number 20 is present in array list");
		} else {
			System.out.println("no such element exist");
		}
		// Remove element at index 1 and 4
		intArr.remove(1);
		intArr.remove(4);
		System.out.println(intArr);
		
		 // Use get method to get the element at index 1
		
		System.out.println("Element at inderx 2 is "+ intArr.get(2));
		
		//Reverse array list
		intArr.r

		ArrayList<Double> deciNum = new ArrayList<Double>();

		// Decimal add
		deciNum.add(10.0);
		deciNum.add(5.0);
		deciNum.add(10.0);
		deciNum.add(20.0);
		deciNum.add(30.00);
		deciNum.add(20.20);
		System.out.println(deciNum);

	}
}
