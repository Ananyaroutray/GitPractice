package com.java.Exceptions;

public class ArithmeticExp {
	
	public static void main(String[] args) {
		int arr[] = new int [] {2,3,5}; 
		try { //The try block is used to enclose a section of code that may potentially throw exceptions
			
			int a = arr[2]/0; //This line attempts to perform an arithmetic operation. It divides the third element of the arr array (which is 5) by 0.
			//This operation will result in an ArithmeticException because division by zero is not allowed in mathematics.
			
		} catch (ArithmeticException e) {// line starts a catch block, which is used to catch and handle exceptions that occur within the try block. It specifies that it will catch an ArithmeticException
			//and assigns the exception to the variable e
			System.out.println("Cannnot be Divisible...");
		}
	}

}
