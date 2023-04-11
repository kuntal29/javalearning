package com.java.learning;

public class StringBuilderClass {

	public static void main(String[] args) {
		String s = "kuntal";
		String s1 = "Sugandhi";
		
		StringBuilder s2 = new StringBuilder("I will learn ");
		StringBuilder s3 = new StringBuilder("JAVA");
        StringBuilder s4 = s2.append(s3);
        System.out.println(s4.toString());
        
	}

}
