package com.java.exception;

// create a unchecked exception class
public class UncheckedException extends RuntimeException {
    public UncheckedException(String message) {
        
        // calling the constructor of RuntimeException
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        
        // Exception try block
        try {
            throw new UncheckedException("This is my custom unchecked exception");
        } 
        // catch block of Exception
        catch (UncheckedException e) {
            e.printStackTrace();
        }
    }
}