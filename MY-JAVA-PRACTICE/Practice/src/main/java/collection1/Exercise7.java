package collection1;

import java.util.ArrayList;


public class Exercise7 {
	public static void main(String[] args) {
		
		ArrayList<String> c1=new ArrayList<>();
		c1.add("khafu");
		c1.add("annu");
		c1.add("aru");
		c1.add("pami");
		
		ArrayList<String> c2=new ArrayList<>();
		c2.add("khafu");
		c2.add("annu");
		c2.add("aru");
		c2.add("aku");
		
		ArrayList<String> c3=new ArrayList<>();		
		for(String e : c1)
			c3.add(c2.contains(e)? "yes" : "no");
		System.out.println(c3);

	}

}
