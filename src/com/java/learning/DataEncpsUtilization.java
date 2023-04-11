package com.java.learning;

import com.java.learning.DataEncaps;

public class DataEncpsUtilization {

	public static void main(String[] args) {
		DataEncaps s = new DataEncaps();
		s.setNumberOfItems(10);
		s.shopnumber(25101);
		System.out.println("Number of items " + "" + s.getNumberOfItems());
		System.out.println("Shop number "+ "" + s.getshopnumber());

	}

}
