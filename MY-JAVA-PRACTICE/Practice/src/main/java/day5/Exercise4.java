package day5;

import java.util.Scanner;

public class Exercise4 {
public static void main(String[] args) {
		
		//for taking user input
		Scanner sc= new Scanner(System.in);
		//takes the first input character coz we dont have nextChar() type method
		//charAt(0) extracts the character at index 0 of the input string.

		char ch=sc.next().charAt(0); 
	      //it will check if the character is from a to z
//		ch is in the range of lowercase letters ('a' to 'z') or in the range of uppercase letters ('A' to 'Z').
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
	    System.out.println(ch +" -> is a character");
	    }
		
		//ch is not within these ranges, it prints a message indicating that it's not a character.
		else{
	    System.out.println("Not a character");
	        }
	    }    

}
