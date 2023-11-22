package MyProject.Practice;

import java.util.Scanner;

public class Assignment{ //class named Assignment
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Convert the number to a string and prepend "+91"
        String numberWithCountryCode = "+91" + Long.toString(number);

        // Print the result
        System.out.println("Number with +91 country code: " + numberWithCountryCode);

        // Close the scanner
        scanner.close();
    }
}

