package com.java.hib;

public class Agent {
	
	 private int AgentID;
	 private String Name;
	 private String City; 
	 private Gender gender; 
	 private String MaritalStatus ;
	 private int Premium ;
	 
	 
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public int getPremium() {
		return Premium;
	}
	public void setPremium(int premium) {
		Premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentID=" + AgentID + ", Name=" + Name + ", City=" + City + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	public Agent(int agentID, String name, String city, Gender gender, String maritalStatus, int premium) {
		super();
		AgentID = agentID;
		Name = name;
		City = city;
		this.gender = gender;
		MaritalStatus = maritalStatus;
		Premium = premium;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
