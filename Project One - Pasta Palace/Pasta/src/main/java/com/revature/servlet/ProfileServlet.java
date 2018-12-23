package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//check whether a session exists for the incoming request
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("username") != null) {
			((Object) req.getRequestDispatcher("profile.html")).forward(req, resp);
		} else {
			resp.sendRedirect("login");
		}
	}

}
