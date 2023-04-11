package com.java.learning;

public class StringReverse {
	
	

	public static String stringReverse(String str) {
		StringBuilder newobj = new StringBuilder(str);
		newobj.reverse();
		return newobj.toString();

	}

}
