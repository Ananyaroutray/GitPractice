package com.java.hib;

import java.util.List;

public interface EmployDAO {
	List<Employ> showEmployDAO();
	Employ searchEmployDAO(int empno);
	String addEmployDao(Employ employ);
	String deleteEmployDao(int empno);
	
	//List<Employ> showEmployCr();
	//Employ searchEmployCr(int empno);
	
}
