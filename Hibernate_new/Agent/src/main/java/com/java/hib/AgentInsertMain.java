package com.java.hib;

import java.util.Scanner;

public class AgentInsertMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("Enter Agent Id: ");
		agent.setAgentID(sc.nextInt());
		System.out.println("Enter Agent Name: ");
		agent.setName(sc.next());
		System.out.println("Enter Agent City: ");
		agent.setCity(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE) ");
		agent.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter MaritalStatus ");
		agent.setMaritalStatus(sc.next());
		System.out.println("Enter Premium ");
		agent.setPremium(sc.nextInt());
		AgentDAO dao = new AgentDAOImpl();
		System.out.println(dao.addAgentDao(agent));
	}

}
