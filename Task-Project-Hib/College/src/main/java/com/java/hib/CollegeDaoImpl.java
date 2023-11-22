package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CollegeDaoImpl implements CollegeDao {
	SessionFactory sf ;
	Session session;

	@Override
	public List<College> showCollegeDAO() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("From College");
		List<College> collegeList = query.list();
		return collegeList;
	}

}
