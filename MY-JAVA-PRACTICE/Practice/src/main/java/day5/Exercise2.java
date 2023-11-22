// constructor with no parameter
package day5;

public class Exercise2 {
	
	String language;

	  // constructor with no parameter
	Exercise2() {
	    this.language = "Java";
	  }

	  // constructor with a single parameter
	Exercise2(String language) {
	    this.language = language;
	  }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.language);
	  }

	  public static void main(String[] args) {

	    // call constructor with no parameter
		  Exercise2 obj1 = new Exercise2();

	    // call constructor with a single parameter
		  Exercise2 obj2 = new Exercise2("Python");

	    obj1.getName();
	    obj2.getName();
	  }
	}