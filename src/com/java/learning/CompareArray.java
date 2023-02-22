package com.java.learning;


import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 15, 22, 35 };
		int[] array2 = { 10, 15, 22 };
		System.out.println("Comapre intarray 1 and int array2" + Arrays.compare(array1, array2));
	}

}
