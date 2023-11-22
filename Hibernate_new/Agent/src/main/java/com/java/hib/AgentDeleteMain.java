package com.java.hib;

import java.util.Scanner;

public class AgentDeleteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id:");
		int agentId = sc.nextInt();
		AgentDAO dao = new AgentDAOImpl();
		System.out.println(dao.deleteAgentDao(agentId));

	}


}
