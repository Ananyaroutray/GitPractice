package collection1;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {
	public static void main(String[] args) {
		
		ArrayList<String> c1=new ArrayList<>();
		c1.add("khafu");
		c1.add("annu");
		c1.add("aru");
		c1.add("pami");
		
		for(String s : c1) {
			System.out.println(s);
		}
			Collections.swap(c1,0,1);
			System.out.println(c1);
	
		for(String s1: c1){
			System.out.println(s1);
		
	}

}

}