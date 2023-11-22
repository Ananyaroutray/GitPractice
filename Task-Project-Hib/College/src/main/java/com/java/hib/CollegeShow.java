package com.java.hib;

import java.util.List;

public class CollegeShow {
	public static void main(String[] args) {
		CollegeDao dao = new CollegeDaoImpl(); 
		List<College> collegeList = dao.showCollegeDAO();
		for(College college : collegeList) {
			System.out.println(college);
		}
			
				}

}
