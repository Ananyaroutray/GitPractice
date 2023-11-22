package com.java.Exceptions;

public class ExceptionHandlingEx1 {
	
	public static void main(String []args) { 
	      try { 
	         int data = 10/2; 
	         System.out.println(data);
	      } catch(NullPointerException e) { 
	         System.out.println(e);
	      } finally { 
	         System.out.println("finally block is always executed"); 
	      } 
	      System.out.println("rest of the code...");
	 }
}
