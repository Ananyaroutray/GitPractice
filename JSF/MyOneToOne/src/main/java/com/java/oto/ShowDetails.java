package com.java.oto;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowDetails {
    public static void main(String[] args) {
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // Retrieve and display Faculty details
        Query facultyQuery = session.createQuery("from Faculty f");
        List<Faculty> facultyList = facultyQuery.list();

        for (Faculty faculty : facultyList) {
            System.out.println("Faculty ID: " + faculty.getFacultyId());
            System.out.println("Name: " + faculty.getName());
            System.out.println("Email: " + faculty.getEmail());

            // Retrieve and display associated Department details
            Department department = faculty.getDepartment();
            if (department != null) {
                System.out.println("Department ID: " + department.getDepartmentId());
                System.out.println("Department Name: " + department.getDepartmentName());
                System.out.println("Location: " + department.getLocation());
            } else {
                System.out.println("No associated department.");
            }

            System.out.println("----------");
        }

        session.close();
    }
}

