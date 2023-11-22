package com.java.otm;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class FetchData {
	public static void main(String[] args) {
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Query query =session.createQuery("from College");
		List<College> list=query.list();
		for(College college:list) {
			System.out.println("College Name"+college.getCollegeName());
			List<Department> list2=college.getDepartments();
			for(Department dept:list2) {
				System.out.println(dept.getDepartmentName()+":");
			}
			
		}
		session.close();
	}


}
