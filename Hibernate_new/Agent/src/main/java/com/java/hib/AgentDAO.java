package com.java.hib;

import java.util.List;

public interface AgentDAO {
	List<Agent> showAgentDAO();
	Agent searchAgentDAO(int agentId);
	String addAgentDao(Agent agent);
	String deleteAgentDao(int agentId);
	String updateAgentDao(Agent agent);

}
