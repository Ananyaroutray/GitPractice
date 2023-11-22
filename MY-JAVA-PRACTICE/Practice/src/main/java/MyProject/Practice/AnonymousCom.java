
package MyProject.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousCom {
	public static void main(String[] args) {
		List<Integer> in = new ArrayList<>();
		
		in.add(453);
		in.add(987);
		in.add(431);
		in.add(123);
		
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) 
					return 1;
				
				return -1;
			}
		};
	
	    Collections.sort(in,com);
	    
	    
		for(Integer i : in) {
			System.out.println(i);
		}
	}

}
