package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.beans.Employees;
import com.revature.service.AuthenticationService;

@WebServlet("/EmployeeLogin")
public class EmployeeLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4008501494161108628L;
	
	AuthenticationService authService = new AuthenticationService();

	//return login page for get request
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("EmployeeLogin.html").forward(req, resp);
	}
	
	//handle POST request from form on login page
	//(or anywhere else)
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handling request...");
		
		//checks whether a session exists, otherwise creates a new one
		//overloaded version takes a boolean create param, if false it returns null if no session exists for the current request
		HttpSession session = req.getSession(false);
		resp.setContentType("text/html");
		//grab params from request
		Credentials cred = new Credentials(req.getParameter("username"), req.getParameter("password"));
		Employees u = (authService.isValidEmployee(cred));
		if (u != null) {
			session.setAttribute("FIRSTNAME", u.getUserName());
			session.setAttribute("LASTNAME", u.getFirstName());
			session.setAttribute("CITY", u.getLastName());
			session.setAttribute("EMPLOYEE_ID", u.getEmployeeId());
			session.setAttribute("EMAIL", u.getEmail());
			resp.sendRedirect("profile");
			
		} else {
			resp.sendRedirect("EMPLOYEE");
		}

	}

}
