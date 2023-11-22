package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class PatientReportsBean
 */
@Stateless
@Remote(PatientReportsBeanRemote.class)
public class PatientReportsBean implements PatientReportsBeanRemote {

	@PersistenceContext(unitName="PMgmtPU")
	  private EntityManager entityManager;
	
	
    /**
     * Default constructor. 
     */
    public PatientReportsBean() {
        // TODO Auto-generated constructor stub

}


	@Override
	public List<PatientReports> showPatientReportsDao() {
		System.out.println("Entity Manager is "+entityManager);
		Query query = entityManager.createQuery("SELECT i FROM PatientReports i");
		return (List<PatientReports>) query.getResultList();
	}


	@Override
	public String addReport(PatientReports patientreport) {
		System.out.println("Entity Manager is "+entityManager);
		entityManager.merge(patientreport);
		return "inserted";
	}
}
