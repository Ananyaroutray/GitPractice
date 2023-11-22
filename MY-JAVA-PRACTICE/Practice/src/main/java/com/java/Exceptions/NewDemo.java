package com.java.Exceptions;

import java.util.Scanner;

public class NewDemo {
	public static void main(String[] args) {
		String s = "ABAmh";
		
		boolean ispalindrome= true;
		int len = s.length();
		
		for(int i=0; i<len/2;i++) {
			if(s.charAt(i)!=s.charAt(len-1-i)) {
            ispalindrome = false;		
       }
		}
			if(ispalindrome) {
				System.out.println("palindrome");
			}else {
				System.out.println("Not palindrome");
			}
		}
	}


