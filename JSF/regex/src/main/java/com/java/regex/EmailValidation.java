package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println( email + " is a valid email" );
        } else {
            System.out.println(email + " is not a valid email");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z][a-zA-Z0-9@!#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]{0,11}@(gmail\\.com|yahoo\\.com)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
