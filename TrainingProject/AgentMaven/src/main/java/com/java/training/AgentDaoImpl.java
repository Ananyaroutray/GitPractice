package com.java.training;

import java.util.ArrayList;
import java.util.List;


	
	public class AgentDaoImpl implements AgentDAO {

		static List<Agent> agentList;
		
		static {
			agentList = new ArrayList<Agent>();
		}
		
		@Override
		public List<Agent> showAgentDao() {
			return agentList;
		}

		@Override
		public String addAgentDao(Agent agent) {
			agentList.add(agent);
			return "Record Inserted...";
		}
	}
