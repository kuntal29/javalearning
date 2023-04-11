package com.java.learning;

public class StringBufferConcept {
  public static void main(String args[]) {
	  
	  StringBuffer sb = new StringBuffer("Hello");
	  sb.append("Java");// to append any string
	  System.out.println(sb); 
	  sb.insert(1, "KUN"); // to insert at index
	  System.out.println(sb);
	  sb.reverse();// to reverse the string
	  System.out.println(sb);
	  sb.replace(1, 3, "kun"); // to replace at index 
	  System.out.println(sb);
  }

}
