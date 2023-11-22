package com.java.regex;

import java.util.regex.Pattern;

public class RegEx1 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".h", "ch"));
		System.out.println(Pattern.matches("..f..i","infinite"));
		System.out.println(Pattern.matches("[aeiou]", "a"));
		System.out.println(Pattern.matches("[aeiou]", "s"));
		
		//Write an expression contains 2 words start with pqr and next char is vowel
		System.out.println(Pattern.matches("[^aeiou]", "a"));
		System.out.println(Pattern.matches("[^aeiou]", "z"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "abccddd"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "ananya123"));
		
		//validation MobileNo
		System.out.println(Pattern.matches("[0-9]{10}", "6097542304"));
		System.out.println(Pattern.matches("[0-9]{10}", "654234979"));
		System.out.println(Pattern.matches("[0-9]{10}", "ABCD23497"));
		System.out.println(Pattern.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}", "1234 3213 4532"));
		System.out.println(Pattern.matches("[+][9][1]-[0-9]{10}", "+91-9938719164"));
		System.out.println(Pattern.matches("\\d{5}", "49164"));
	}

}
