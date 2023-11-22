package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No ");
		empno = sc.nextInt();
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		if(employList.size() > 0) {
			Employ employee = employList.get(0);
			Transaction transaction = session.beginTransaction();
			session.delete(employee);
			transaction.commit();
			System.out.println("* Record Deleted *");

		} else {
			System.out.println("* Employ Record not found *");

		}
	}
}
