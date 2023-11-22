package day2;

import java.util.Scanner;

public class PalindromeString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next(); // Read the input string

        boolean isPalindrome = true; // Use lowercase for variable names

        int len = str.length(); // Calculate the length of the string
        for (int i = 0; i < len / 2; i++) { // Iterate up to half the length
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
            	
                isPalindrome = false;
                break; // No need to continue checking if it's not a palindrome
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
