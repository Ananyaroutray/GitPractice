package com.java.Exceptions;

public class MulExpHandling {
	
	public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4] / 0; // ArrayIndexOutOfBoundsException and ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        }
    }

}
