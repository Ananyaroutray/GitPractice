package com.java.Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException; //InputMismatchException is a type of exception 
//that is thrown when the input provided by the user doesn't match the expected data type.

public class InputMismatchExp {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            int[] arr = new int[3]; //array with 3 elements
	            for (int i = 0; i < 3; i++) { //This line starts a for loop that iterates three times. 
	            	//It is used to prompt the user to enter three integers.
	                System.out.print("Enter an integer: ");
	                arr[i] = scanner.nextInt(); //This line attempts to read an integer value entered by the user using the nextInt() method of the Scanner class. 
	                //If the user enters a non-integer value (e.g., a string), it will result in an InputMismatchException.
	                
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Input mismatch exception.");
	        }
	    }
	}

