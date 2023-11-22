package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	
	public List<String> getNames(){
		List<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Amit");
		names.add("Ansal");
		names.add("Subhudi");
		names.add("Satya");
		return names;

	}
	public List<Employ>showEmploy()
	{
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Gaurav","Java","Developer",65459.2));
		employList.add(new Employ(2,"Harshit","J2EE","Expert",75459.2));
		employList.add(new Employ(3,"Swathi","MySql","Programmer",95459.2));
		employList.add(new Employ(4,"Abhishek","Angular","Tester",55459.2));
		employList.add(new Employ(5,"Sireesha","React","Manager",15459.2));
		return employList;
	}

}
