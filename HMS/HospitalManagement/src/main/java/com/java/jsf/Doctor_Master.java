package com.java.jsf;

public class Doctor_Master {
	private String dr_id;
	private String dr_name;
	private String dept;
	public String getDr_id() {
		return dr_id;
	}
	public void setDr_id(String dr_id) {
		this.dr_id = dr_id;
	}
	public String getDr_name() {
		return dr_name;
	}
	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Doctor_Master() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor_Master(String dr_id, String dr_name, String dept) {
		super();
		this.dr_id = dr_id;
		this.dr_name = dr_name;
		this.dept = dept;
	}
	
}