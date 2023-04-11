package com.java.learning;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String temp = "";
		temp = str;
		System.out.println(StringReverse.stringReverse(str));
		if (temp == str) {
			System.out.println("Word is palindrome");
		}
		else {
			System.out.println("Word is not palindrome");
		}
		
		String orgstr = "radar";
		String revstr = "";
		int strlength = orgstr.length();
		for (int i = (strlength -1); i <=0; --i) {
			revstr = revstr + orgstr.charAt(i);
		}
		if(orgstr.toLowerCase().equals(revstr.toLowerCase())) {
			System.out.println("Word is palindrome seocnd" + orgstr);
		}
		else {
			System.out.println("Word is not palindrome second" + orgstr);
		}

	}

}
