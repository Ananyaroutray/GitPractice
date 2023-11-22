package com.java.training;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class AgentMain {

	private static final Logger log = Logger.getLogger("com.java.infinite.AgentMain");
		static AgentBAL bal;
		static Scanner sc;
		
		static {
			bal = new AgentBAL();
			sc = new Scanner(System.in);
		}
		
		public static void main(String[] args) {
			int choice;
			log.info("Program Execution Stared");
			do {
				System.out.println("O P T I O N S");
				System.out.println("-------------");
				System.out.println("1. Add Agent");
				System.out.println("2. Show Agent");
				System.out.println("Enter Your Choice  ");
				choice = sc.nextInt();
				switch(choice) {
				case 1 : 
					try {
						addAgentMain();
					} catch (AgentException e) {
						System.err.println(e.getMessage());
						log.error(e.getMessage());
					}
					break;
				case 2 : 
					showAgentMain();
					break;
	
				
				}		
			} 
			while(choice!=2);
		}
			public static void showAgentMain() {
				List<Agent> agentList= bal.showAgentBal();
				for (Agent agent : agentList) {
					System.out.println(agent);
				}
			}
			public static void addAgentMain() throws AgentException {
				Agent agent = new Agent();
				System.out.println("Enter AgentId:   ");
				agent.setAgentId(sc.nextInt());
				System.out.println("Enter First Name:  ");
				agent.setFirstName(sc.next());
				System.out.println("Enter Last Name: ");
				agent.setLastName(sc.next());
				System.out.println("Enter city: ");
				agent.setCity(sc.next());
				System.out.println("Enter Paymode:(MONTHLY/HALFYEARLY/YEARLY/QUARTERLY) ");
				agent.setPayMode(PayMode.valueOf(sc.next()));
				System.out.println("Enter Premium: ");
				agent.setPremium(sc.nextDouble());
				System.out.println(bal.addAgentBal(agent));
				
				
			}
		}
		
			
			

