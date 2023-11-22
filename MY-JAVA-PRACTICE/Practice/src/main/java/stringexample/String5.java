package stringexample;

//Java Program to Illustrate equalsIgnoreCase() method

//Importing required classes
import java.lang.*;

//Main class
public class String5 {
	// Main driver method
	public static void main(String[] args)
	{
		// Declaring and initializing strings to compare
		String str1 = "Ananya Routray";
		String str2 = "Khafia Ayyub";
		String str3 = "Pramita Dash";

		// Comparing strings
		// If we ignore the lower and upper cases
		boolean result1 = str2.equalsIgnoreCase(str1);

		// Both the strings are equal so display true
		System.out.println("str2 is equal to str1 = "
						+ result1);

		// Even if we ignore the cases
		boolean result2 = str2.equalsIgnoreCase(str3);

		// Both the strings are not equal so display false
		System.out.println("str2 is equal to str3 = "
						+ result2);
	}
}

