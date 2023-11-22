package com.java.bankservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankSearchServlet
 */
public class BankSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int accountNo=Integer.parseInt(request.getParameter("accountNo"));
		BankDAO dao = new BankDAOImpl();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;");
		
		try {
			Bank bank = dao.searchAccountDao(accountNo);
			if(bank!=null) {
				out.println("Account No   "+bank.getAccountNo()+"<br/>");
				out.println("Employ Name  "+bank.getFirstName()+ bank.getLastName()+"<br/>");
				out.println("City  "+bank.getCity()+"<br/>");
				out.println("State  "+bank.getState()+"<br/>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
