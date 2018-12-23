package com.revature.servlet;

public interface HttpServletRequest {

	Object getRequestDispatcher(String string);

	HttpSession getSession(boolean b);

	HttpSession getSession1(boolean b);

	Object getRequestDispatcher1(String string);

	Object getParameter(String string);

}
