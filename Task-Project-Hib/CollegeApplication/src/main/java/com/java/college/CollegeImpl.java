package com.java.college;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class CollegeImpl {
	SessionFactory sf ;
	Session session;

	
	public List<College> showCollegeDAO() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(College.class);
		return cr.list();
	}
	
}
