package com.java.maven;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import jdk.internal.org.jline.utils.Log;

public class Calculation {
	private static final Logger log = Logger.getLogger("com.java.infinite.Calculation");
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		try {
			a = sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division is:" +c);
			Log.info("Program Executed with no expression");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible");
			Log.error("Custom Error Division By zero Not possible");
			
			
		}catch (InputMismatchException e) {
			System.out.println("String cannot be converted as integer");
			Log.error("Custom Error String can not be converted as integer");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
