package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EjbImpl {

	

	public List<PatientReports> showpatientReport() throws NamingException{
		PatientReportsBeanRemote remote = RemoteHelper.lookupRemoteStatelessHms();
		return remote.showPatientReportsDao();
	}
	
		
	public String addPatient(PatientReports patientreport) throws NamingException {
		PatientReportsBeanRemote remote=RemoteHelper.lookupRemoteStatelessHms();
		remote.addReport(patientreport);
		return "ShowPatientReports.jsp?faces-redirect=true";
	}
	
	
}
