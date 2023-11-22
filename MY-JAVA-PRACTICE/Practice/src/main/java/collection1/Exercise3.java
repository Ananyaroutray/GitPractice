package collection1;

import java.util.ArrayList;

public class Exercise3 {
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("me");
		s.add("you");
		s.add("us");
		System.out.println("List of string before:"+s);
		s.add(0,"pramita");
		s.add(2,"both");
		System.out.println("List of string after:"+s);

		//insertion not replacement
		
	}

}
