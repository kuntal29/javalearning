package com.java.learning;

public class AbstractClass3 extends AbstractClass2{

	@Override
	void run() {
		System.out.println("The child class abstract method is called");
	}
	
	@Override
	void printstatus() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		AbstractClass3 obj = new AbstractClass3();
		obj.run();
	}



}
