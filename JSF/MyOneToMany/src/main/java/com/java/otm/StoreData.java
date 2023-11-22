package com.java.otm;

import java.util.ArrayList;  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreData {  
    public static void main(String[] args) {  
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        
        College college = new College();
        college.setId(111);
        college.setCollegeName("Gita autonomus college");
        college.setLocation("Bhubaneswar");
        

        
        Department department1 = new Department();
        department1.setDepartmentName("Computer Science");
        department1.setHeadOfDepartment("Aisworya");
        

        Department department2 = new Department();
        
        department2.setDepartmentName("Electrical Engineering");
        department2.setHeadOfDepartment("Khafia Ayyub");
        

        
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(department1);
        departments.add(department2);
        college.setDepartments(departments);
        
        
        session.save(college);          

        t.commit();
        session.close();
        System.out.println("Success");
    }  
}
