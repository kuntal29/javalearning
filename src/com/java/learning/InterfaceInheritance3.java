package com.java.learning;


// using one extended interface to achieve multiple inheritance 
public class InterfaceInheritance3 implements InterfaceInheritance1{
	
	public static void main(String args[]) {
		InterfaceInheritance3 test = new InterfaceInheritance3();
		test.print();
		test.show();
		
		
	}

	@Override
	public void show() {
		System.out.println("Multiple Inheritanc through interface - child class immplementation - method show");
		
	}

	@Override
	public void print() {
		System.out.println("Multiple Inheritanc through interface - child class immplementation - method print");
		
	}
	
	

}
