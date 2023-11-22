package com.java.realtime;

import java.sql.SQLException;
import java.util.List;

public interface EmployDAO {
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException ;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employNew) throws ClassNotFoundException, SQLException;
	

}