package com.revature.main;

import java.io.IOException;
package com.revature.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.EmployeesDAO;
import com.revature.dao.EmployeesDAOImpl;
import com.revature.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProcessSchedule {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = ConnectionUtil.getConnection("connection.properties");
			System.out.println("Connected");
		}
		catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub

	}
	
	public static String acronym(String string) {
		return string; 
	}
	
	

}
