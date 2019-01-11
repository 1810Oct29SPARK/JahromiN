package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employee;
import com.revature.beans.Employees;
import com.revature.beans.Role;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

	private int EMPLOYEE_ID;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// grab current session, if it exists
		HttpSession session = request.getSession(false);
		if (session != null) {
			try {
				int id = (int) session.getAttribute("EMPLOYEE_ID");
				String firstname = session.getAttribute("FIRSTNAME").toString();
				String lastname = session.getAttribute("LASTNAME").toString();
				String email = session.getAttribute("EMAIL").toString();
				Employees e = new Employees(EMPLOYEE_ID, firstname, lastname, email, new Role(), null, null);
				response.getWriter().write(new ObjectMapper().writeValueAsString(e));

			} catch (Exception e) {
				response.getWriter().write("{\"session\":null}");
			}
		} 
	}
}
