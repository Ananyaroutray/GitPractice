package com.java.oto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDetails{
	
    public static void main(String[] args) {
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction t = session.beginTransaction();
        
        // Create a Faculty
        Faculty faculty = new Faculty();
        faculty.setFacultyId(101);
        faculty.setName("Aiswarya");
        faculty.setEmail("aish20@gmail.com");
        
        // Create a Department
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Computer Science");
        department.setLocation("Building A");
        
        // Associate the Faculty with the Department
        faculty.setDepartment(department);
        department.setFaculty(faculty);
        
        // Save the Faculty and Department
        session.save(faculty);
        session.save(department);
        
        t.commit();
        
        session.close();
        System.out.println("Success");
    }
}

