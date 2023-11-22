package com.java.hib;

import java.lang.module.Configuration;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employlist = query.list();
		for (Employ employ : employlist) {
			System.out.println(employ);
		}
	}

}
