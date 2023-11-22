//byte to string

package day5;
class Exercise1 { 

	// Function to convert 
	// byte value to String value 
	public static String convertByteToString(byte byteValue) 
	{ 

		// Convert byte value to String value 
		// using + operator method 
		String stringValue = "" + byteValue; 
		return (stringValue); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// The byte value 
		byte byteValue = 1; 

		// The expected string value 
		String stringValue; 

		// Convert byte to string 
		stringValue = convertByteToString(byteValue); 

		// Print the expected string value 
		System.out.println( byteValue + " after converting into string = "+ stringValue); 
	} 
} 
