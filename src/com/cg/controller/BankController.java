package com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.dao.BankAccountDAOimpl;
import com.cg.pojo.BankAccount;
import com.cg.pojo.CurrentAccount;
import com.cg.pojo.Customer;
import com.cg.pojo.SavingsAccount;

/**
 * Servlet implementation class BankController
 */
@WebServlet("*.app")
public class BankController extends HttpServlet {
	Customer customer;
	SavingsAccount savings;
	CurrentAccount current;
	BankAccountDAOimpl dao = new BankAccountDAOimpl();
	Collection<BankAccount> accountList = new ArrayList<>();
	private BankAccount bankAccount;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		customer = new Customer(request.getParameter("name"), request.getParameter("email"), request.getParameter("dob"), request.getParameter("phone"));
		
		String result = request.getServletPath();
		
		switch(result) {
		
		case "/add.app":
			RequestDispatcher dispatcher = request.getRequestDispatcher("AddAccount.jsp");
			dispatcher.forward(request, response);
			break;
		case "/view.app":
			switch(request.getParameter("acctype")) {
			
			case "savings":
				switch(request.getParameter("sal")) {
				case "salaried":
					savings = new SavingsAccount(customer, Integer.parseInt(request.getParameter("salbal")), true);
					dao.addAccount(savings);
					request.setAttribute("account", savings);
					 dispatcher = request.getRequestDispatcher("View.jsp");
					dispatcher.forward(request, response);
					break;
					
				case "nonsalaried":
					savings = new SavingsAccount(customer, Integer.parseInt(request.getParameter("nonsalbal")), false);
					dao.addAccount(savings);
					request.setAttribute("account", savings);
					dispatcher = request.getRequestDispatcher("View.jsp");
					dispatcher.forward(request, response);
					break;
				}
				
			case "current":
				current = new CurrentAccount(customer, Integer.parseInt(request.getParameter("currentbal")), Integer.parseInt(request.getParameter("overdraft")));
				dao.addAccount(current);
				request.setAttribute("account", current);
				 dispatcher = request.getRequestDispatcher("View.jsp");
				dispatcher.forward(request, response);
				break;
			}
			
		case "/back.app":
			 dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			break;
			
		case "/displayall.app":
			accountList = dao.viewAllEmployees();
			request.setAttribute("account", accountList);
			dispatcher = request.getRequestDispatcher("ViewAll.jsp");
			dispatcher.forward(request, response);
			break;
			
		case "/with.app":
			dispatcher = request.getRequestDispatcher("Withdraw.jsp");
			dispatcher.forward(request, response);
			break;
			
		case "/withdraw.app":	
			int test = dao.withdraw(Integer.parseInt(request.getParameter("money")), Integer.parseInt(request.getParameter("accno")));
			
				request.setAttribute("withdrawl", test);
				dispatcher = request.getRequestDispatcher("Withdrawl.jsp");
				dispatcher.forward(request, response);
				break;
			
		}
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
