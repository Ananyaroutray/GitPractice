package com.java.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		boolean ispalindrome = true;
		
		int len = str.length();
		
		for(int i=0; i < len/2 ; i++) {			
			if(str.charAt(i) != str.charAt(len - 1 - i)){
				
				ispalindrome = false;
				break;
			}
			
		}
		if(ispalindrome) {
			System.out.println("Palindrome!!");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
