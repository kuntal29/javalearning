package com.java.learning;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 9, 10, 4, 59 };
		for(int n: arr) {
			if( n%2 == 0) {
				System.out.println("number is even");
			}
				else {
					System.out.println("number is odd");
				}
				
			}
		String[] str = {"Java", "Karate", "C++", ".net"};
		for (String str1: str) {
			System.out.println(str1);
			System.out.println(str1.charAt(0));
			System.out.println(str1.length());
		}
			
		}

	}

