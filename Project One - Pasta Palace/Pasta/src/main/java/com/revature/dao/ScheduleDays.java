package com.revature.dao;

import com.revature.beans.Employees;
import com.revature.servlet.Role;

public class ScheduleDays extends Employees {

	public ScheduleDays(int i, String string, String string2, String string3, Role role, String username,
			String password) {
		super(i, string, string2, string3, role, username, password);
		// TODO Auto-generated constructor stub
	}

	public ScheduleDays(String mONDAY, String tUESDAY, String wEDNESDAY, String tHURSDAY, String fRIDAY,
			String sATURDAY, String sUNDAY) {
		// TODO Auto-generated constructor stub
	}

}
