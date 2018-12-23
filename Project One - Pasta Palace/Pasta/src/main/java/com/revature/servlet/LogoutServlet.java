package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -644238306652448520L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		((Object) request.getRequestDispatcher("index.html")).include(request, response);
		HttpSession session = request.getSession(false);
		if (session != null) {
			((Object) session).invalidate();
		}
		pw.println("<p>You are successfully logged out</p>");
		pw.println("</div>");
		pw.println("<a href=\"login\">back to login</a>");
		pw.println("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
