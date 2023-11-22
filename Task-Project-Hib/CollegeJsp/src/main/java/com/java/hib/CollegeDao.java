package com.java.hib;

import java.sql.SQLException;
import java.util.List;

public interface CollegeDao {
	List<College> showCollegeDAO() throws ClassNotFoundException, SQLException;
	String addcollege(College college) throws ClassNotFoundException, SQLException;

}
