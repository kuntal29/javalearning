package com.java.learning;

public class AbstractShapeTest  {
	
	public static void main(String args[]) {
		AbstractClassShape obj = new AbstractClassRectangle();
		AbstractClassShape obj2 = new AbstractClassCircle();
		obj.draw();
		obj2.draw();
		
	}

}
