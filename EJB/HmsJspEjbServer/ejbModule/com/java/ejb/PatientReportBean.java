package com.java.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Remote(PatientReportRemote.class)
public class PatientReportBean implements PatientReportRemote {
	
	@PersistenceContext(unitName = "PMgmtPU")
	 private EntityManager entityManager;
	
	public PatientReportBean() {
        // TODO Auto-generated constructor stub
    }

	

	@Override
	public String addreport(PatientReport patientreport) {
		System.out.println("Entity manager is "+ entityManager);
		entityManager.merge(patientreport);
		return "Employ Record Inserted...";
	}

}
