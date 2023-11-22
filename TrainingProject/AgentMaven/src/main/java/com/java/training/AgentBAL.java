package com.java.training;

import java.util.List;

public class AgentBAL {

	static StringBuilder sb;
	static AgentDAO dao;
	static {
		sb = new StringBuilder();
		dao = new AgentDaoImpl();
	}
	
	
	public List<Agent> showAgentBal() {
		return dao.showAgentDao();
	}
	
	public String addAgentBal(Agent agent) throws AgentException {
		if (validateAgent(agent)==true) {
			return dao.addAgentDao(agent);
		}
		throw new AgentException(sb.toString());
	}
	
	public boolean validateAgent(Agent agent) {
		boolean flag = true;
		
		if (agent.getFirstName().length() < 5) {
			flag = false;
			sb.append("First Name Contains min 4 characters...\r\n");
		}
		if (agent.getLastName().length() < 4) {
			flag = false;
			sb.append("Last name Contains min 3 characters...\r\n");
		}
		if(agent.getCity()=="Delhi") {
			flag=false;
			sb.append("City cannotbe Delhi");
		}
		if (agent.getPremium() < 5000 || agent.getPremium() > 99000) {
			flag = false;
			sb.append("Premium Must be between 10000 and 80000...\r\n");
		}
		return flag;
	}
}

