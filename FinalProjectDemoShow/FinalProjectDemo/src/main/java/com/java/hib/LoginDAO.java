package com.java.hib;

import java.util.List;

public interface LoginDAO {
	
	public String loginDao(Login login);
	List<Login> showLogin();
	String addMember(Login login);
//	List<PatientAppointment> searchMember(String status);
//	List<PatientAppointment> searchMemberVisited(String status);

}
