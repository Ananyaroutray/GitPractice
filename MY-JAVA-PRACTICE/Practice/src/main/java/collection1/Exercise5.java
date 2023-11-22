package collection1;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {
		List<Integer> in = new ArrayList<>();
		in.add(8);
		in.add(4);
		in.add(5);
		in.add(1);
		
		//search for the element
		if(in.contains(8)) {
			System.out.println("Found element");
		}else {
			System.out.println("Not Found");
		}
	}

}
