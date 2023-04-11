package com.java.learning;

public class TypeCasting {

	public static void Widening(){
		int a =10;
		float f = (float)a;
		 System.out.println(f);
	}
	
	public void Narrow(){
		float a =10.30f;
		int f = (int)a;
		 System.out.println(f);
	}

	public static void main(String[] args) {
		//float f = 10.30f; ********other way
		//int a = (int) f;
		//System.out.println(a);
		Widening();
		TypeCasting obj = new TypeCasting();
		obj.Narrow();

	}
	
	
}
