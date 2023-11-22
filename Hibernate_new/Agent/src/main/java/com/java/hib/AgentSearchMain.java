package com.java.hib;

import java.util.Scanner;

public class AgentSearchMain {
	public static void main(String[] args) {
		int agentId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent Id:");
		agentId = sc.nextInt();
		AgentDAO dao = new AgentDAOImpl();
		Agent agent = dao.searchAgentDAO(agentId);
		if(agent!=null) {
			System.out.println(agent);
		}
	}

}
