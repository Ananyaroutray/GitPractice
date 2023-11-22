package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
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
		Criteria cr = session.createCriteria(College.class);
		return cr.list();
	}

}
