package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployList {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Ananya",48765));
		employList.add(new Employ(2,"Khafia",48865));
		employList.add(new Employ(3,"Pramita",48365));
		employList.add(new Employ(4,"Akanskha",38765));
		employList.add(new Employ(5,"Sonali",48755));
		employList.add(new Employ(6,"Tanya",42765));
		System.out.println("Employ Records are:");
		employList.forEach(x->{
			System.out.println(x);
			
		});
	}

}
