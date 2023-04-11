package com.java.learning;

public class InterfacePrintableShowable implements InterfacePrintable, InterfaceShowable {

	@Override
	public void show() {
		System.out.println("Child class implementation and object from interdace showable ");

	}

	@Override
	public void print() {
		System.out.println("Child class implementation and object from interdace printable ");

	}

	public static void main(String args[]) {
		InterfacePrintableShowable obj = new InterfacePrintableShowable() ;
		obj.print();
		obj.show();
		

	}

}
