package com.java.exception;

 public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        
        // function calling for exception
        super(message);
    }
}

class New{
    
    // Function for age validation 
    static void validateAge(int age) throws InvalidAgeException {
        
        // Condition for validating the exception 
        if (age < 18)
            throw new InvalidAgeException("Not a valid age");
        else
            System.out.println("Welcome to vote");
    }

    public static void main(String args[]) {
        
        // try block to call validate age function
        try {
            validateAge(13);
        } 
        // Exception block
        catch (InvalidAgeException m) {
            System.out.println("Exception occured: " + m);
        }
    }
}