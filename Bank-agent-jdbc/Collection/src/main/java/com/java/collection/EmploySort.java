package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Ananya",48765));
		employList.add(new Employ(2,"Khafia",48865));
		employList.add(new Employ(3,"Pramita",48365));
		employList.add(new Employ(4,"Akanskha",38765));
		employList.add(new Employ(5,"Sonali",48755));
		employList.add(new Employ(6,"Tanya",42765));
		System.out.println("Employ Records are:");
		
		System.out.println("sort by name-wise ");
		Collections.sort(employList,(e1,e2)->{
			return e1.getName().compareTo(e2.getName());
		});
		employList.forEach(System.out::println);Collections.sort(employList,(e1,e2)->{
			return (int) (e1.getBasic()-e2.getBasic());
		});
		System.out.println("Sort-By Basic ");
		employList.forEach(System.out::println);
		
	}

}
