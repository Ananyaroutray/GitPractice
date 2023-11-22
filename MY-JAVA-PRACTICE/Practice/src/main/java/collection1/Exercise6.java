package collection1;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("me");
		s.add("you");
		s.add("us");
		System.out.println(s);
		
		List<String> sub = s.subList(0, 2);
		System.out.println(sub);
		
	}

}
