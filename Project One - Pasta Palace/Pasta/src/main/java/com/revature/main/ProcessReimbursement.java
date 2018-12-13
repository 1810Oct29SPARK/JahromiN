package com.revature.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.util.ConnectionUtil;

public class ProcessReimbursement {

	public static void main(String[] args) {
	
		//construct tables in an RDS to support these operations! 
		//implement BankUtil methods and demonstrate their use in this main method.
		Connection conn = null;
		try {
			conn = ConnectionUtil.getConnection("connection.properties");
		}
		catch (SQLException | IOException e) {
			e.printStackTrace();
		}


		UserDAO ud = new UserDAOImpl(conn);
		AccountDAO ad = new AccountDAOImpl(conn);
		BankUtil bu = new BankUtil(ad, ud);
		
		// BankUtil testing cases
		try {
			
			List<Account> accountList = bu.viewAccountsByUser(2);
			for (Account a: accountList) {
				System.out.println(a);
			}
			
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		


	}
	
}
		