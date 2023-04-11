package com.java.learning;

public class ExceptionUserDefinedTest {

	public static void main(String[] args) {
		try
		{
		       // throw an object of user defined exception  
			throw new ExceptionUserDefined("This is user defined exception");
		}
		catch (ExceptionUserDefined exuserdefined) {
			System.out.println("Caught the exception");  
			System.out.println(exuserdefined.getMessage());
		}

	}

}
