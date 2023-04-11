package com.java.learning;

public class InterFace2 implements Intrerface1 {

	@Override
	public void print() {
		System.out.println("Method ineheritated from paraent class implemenetaiton in child class");
		
	}
	
	public static void main (String args[]) {
		InterFace2 obj  = new InterFace2();
		obj.print();
	}

}
