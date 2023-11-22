package com.java.hib;

import java.util.List;

public interface CollegeDao {
	    List<College> getAllColleges();
	    College getCollegeById(int collegeId);
	    void addCollege(College college);
	    
	}



