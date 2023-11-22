package stringexample;

 // Java code to demonstrate the
//working of substring(int begIndex)
public class String2 {
	
	public static void main(String args[])
	{

		// Initializing String
		String Str = new String("WelcometoStringClass");

		// using substring() to extract substring
		// returns (whiteSpace)String Class

		System.out.print("The extracted substring is : ");
		System.out.println(Str.substring(10));
	}
}

