package collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(3);
		al.add(4);
		al.add(7);
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
	}

}
