package stringexample;

//Java program to demonstrate
//working of charAt() method

//driver class
 public class String1 {
	// main function
	public static void main(String args[])
	{
		String s = new String("Welcome! to String class Example");

		char ch = s.charAt(3);
		System.out.println(ch);

		ch = s.charAt(0);
		System.out.println(ch);
	}
}
