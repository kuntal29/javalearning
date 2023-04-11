package com.java.learning;

import java.util.Arrays;

public class StringConcept {

	static String name = "kuntal";

	static char[] ch = { 'k', 'u', 'n', 't', 'a', 'l' };

	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(ch);

		String s = new String("Welcome kuntal");
		String s1 = "Welcome";
		String s3 = "Kuntal Sugandhi";
		String s4 = "I am Good in java";
		String s7 = "Java is good. Java is best. Java is awesome";
		System.out.println(s + s1);
		System.out.println("Comapre of two strings " + s.compareTo(s1));// To compare two strings
		System.out.println("will display char at 5th index " + s.charAt(5));// to display chat at specified index
		System.out.println(" lenght of string " + s.length());// to display length of string
		System.out.println("Substring of string is " + s3.substring(1));// to display substring at chat index 1
		System.out.println("Substring of string is " + s3.substring(0, 1));// to display substring at chat index 0& 1
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(6));// display the substring at chat 6
																					// (full)
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // to display substring at
		// chat index 0 & 1
		String newtext = new String("I will learn java");
		String[] sentences = newtext.split("\\.");
		System.out.println(Arrays.toString(sentences)); // To slipt senteances
		System.out.println(Arrays.toString(ch));

		String s5 = s4.replace("I", "K");
		String s6 = s4.replace("Java", "kava");
		String s8 = s7.replace("Java", "Kava");
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s8);

		// for loop to print each chat in a string
		for (int i = 0; i < s.length(); i++)
			System.out.println("Print single char at each index " + s.charAt(i));
	}

}
