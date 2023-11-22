package com.java.Exceptions;

public class ArrException {
	
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3};
		try {
		System.out.println(arr[4]); //This line attempts to access the element at index 4 of the arr array.
		//However, the arr array only has elements at indices 0, 1, and 2, so attempting to access an element at index 4 will result in an ArrayIndexOutOfBoundsException because it is out of bounds. 
			
		} catch (ArrayIndexOutOfBoundsException e) {//This line starts a catch block, which is used to catch and handle exceptions that occur within the try block.
			//It specifies that it will catch an ArrayIndexOutOfBoundsException and assigns the exception to the variable e 
			
		
			System.out.println("It's Array Out of Bound...");
		}
		
	}

}
