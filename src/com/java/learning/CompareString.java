package com.java.learning;

public class CompareString {

	public static void main(String[] args) {
		String str = "karate";
		String str1 = "karate";
		String str2 = "karate";
		String str3 = "Karate";
		String text = "abc";
		String text2 = "Raj Kamal";
		String text3 = "Kamal karte ho";
		String text4 = "Karate java";
		String str4 = "Kuntal";
		int ln = str.length();
		System.out.println(ln);
		System.out.println(str.charAt(1));
		System.out.println(str.length());
		System.out.println(str.compareTo(str1));
		System.out.println(str2.compareToIgnoreCase(str3));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(text.toUpperCase());
		System.out.println(text2.charAt(4));
		System.out.println(text2.toCharArray());
		System.out.println(text3.substring(1));
		System.out.println(text3.substring(5));
		System.out.println(text3.substring(0, 5));
		System.out.println(text4.replace("a", "t"));
		System.out.println(str);
		char[] ch = str4.toCharArray();
		for (char i : ch) {
			System.out.println(i);
		}

	}
}
