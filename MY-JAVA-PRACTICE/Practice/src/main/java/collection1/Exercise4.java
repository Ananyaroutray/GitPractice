package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
	public static void main(String[] args) {
		List<String> str=new ArrayList<>();
		str.add("Yellow");
		str.add("Red");
		str.add("Pink");
		str.add("Black");
		System.out.println(str);
		str.set(1,"Blue"); //update
		str.remove(2); //remove
		System.out.println(str);
		
		Collections.sort(str);//sorting
		System.out.println(str);
	}

}
