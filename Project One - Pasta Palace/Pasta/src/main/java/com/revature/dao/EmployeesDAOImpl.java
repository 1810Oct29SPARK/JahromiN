package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employees;
import com.revature.dao.EmployeesDAO;
import com.revature.util.ConnectionUtil;

public class EmployeesDAOImpl implements EmployeesDAO {
	private static final String filename="connection.properties";
			
	@Override
	public List<Employees> getEmployee() {
		List<Employees> el = new ArrayList<>();
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT E.E_ID, E.FIRSTNAME, E.LASTNAME, E.EMAIL, E.PHONE, E.ADDRESS, E.L_ID " + 
					"FROM EMPLOYEE E";
			//statement needed to run the string in sql
			Statement stmt = con.createStatement();
			ResultSet ers = stmt.executeQuery(sql);
			
			while (ers.next()) {
				int E_ID = ers.getInt("E_ID");
			    String FIRSTNAME = ers.getString("FIRSTNAME");
			    String LASTNAME = ers.getString("LASTNAME");
			    String EMAIL = ers.getString("EMAIL");
			    String PHONE = ers.getString("PHONE");
			    String ADDRESS = ers.getString("ADDRESS");
			    int L_ID = ers.getInt("L_ID");
			    el.add(new Employees(E_ID, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, L_ID, ADDRESS, L_ID, L_ID, L_ID));
			   
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return el;
	}

	/*
	 * 	FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		ADDRESS = aDDRESS;
		CITY = cITY;
		STATE = sTATE;
		ZIPCODE = zIPCODE;
		TITLE = tITLE;
		REPORTSTO = rEPORTSTO;
		BIRTH_YEAR = bIRTH_YEAR;
		PHONE_NUMBER = pHONE_NUMBER;
	 * 
	 */
	
	@Override
	public Employees getEmployeeById (int eMPLOYEE_ID) {
		Employees n = null;
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT EMPLOYEE_ID, FIRSTNAME, LASTNAME, ADDRESS, CITY, STATE, ZIPCODE, TITLE, REPORTSTO, BIRTH_YEAR, PHONE_NUMBER FROM EMPLOYEE WHERE E_ID=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, eMPLOYEE_ID);
			ResultSet ers = stmt.executeQuery();
			while (ers.next()) {
				int EMPLOYEE_ID = ers.getInt("EMPLOYEE_ID");
			    String FIRSTNAME = ers.getString("FIRSTNAME");
			    String LASTNAME = ers.getString("LASTNAME");
			    String ADDRESS = ers.getString("ADDRESS");
			    String CITY = ers.getString("CITY");
			    String STATE = ers.getString("STATE");
			    int ZIPCODE = ers.getInt("ZIPCODE");
			    String TITLE = ers.getString("TITLE");
			    int REPORTSTO = ers.getInt("REPORTSTO");
			    int BIRTH_YEAR = ers.getInt("BIRTH_YEAR");
			    int PHONE_NUMBER = ers.getInt("PHONE_NUMBER");
				n = new Employees(EMPLOYEE_ID, FIRSTNAME, LASTNAME, ADDRESS, CITY, STATE, ZIPCODE, TITLE, REPORTSTO, BIRTH_YEAR, PHONE_NUMBER);
			   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;

	}
	
	/*
	 * (non-Javadoc)
	 * 		EMPLOYEE_ID = eMPLOYEE_ID;
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		ADDRESS = aDDRESS;
		CITY = cITY;
		STATE = sTATE;
		ZIPCODE = zIPCODE;
		TITLE = tITLE;
		REPORTSTO = rEPORTSTO;
		BIRTH_YEAR = bIRTH_YEAR;
		PHONE_NUMBER = pHONE_NUMBER;
	 * @see com.revature.dao.EmployeesDAO#createEmployee(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 */

	@Override
	public Employees createEmployee(int eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, int zIPCODE, String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, eMPLOYEE_ID);
			p.setString(2, fIRSTNAME);
			p.setString(3, lASTNAME);
			p.setString(4, aDDRESS);
			p.setInt(5, zIPCODE);
			p.setString(6, tITLE);
			p.setInt(7, rEPORTSTO);
			p.setInt(8, bIRTH_YEAR);
			p.setInt(9, pHONE_NUMBER);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Employees deleteEmployee (int eMPLOYEE_ID) {
			try (Connection con = ConnectionUtil.getConnection(filename)) {
				String sql = "DELETE FROM EMPLOYEE WHERE E_ID=?";
				PreparedStatement p = con.prepareStatement(sql);
				p.setInt(1, eMPLOYEE_ID);
				p.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}

	@Override
	public Employees updateEmployee(int eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, int zIPCODE, String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE EMPLOYEE SET FIRSTNAME=?, LASTNAME=?, EMAIL=?, PHONE=?, ADDRESS=? WHERE E_ID=?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, eMPLOYEE_ID);
			p.setString(2, fIRSTNAME);
			p.setString(3, lASTNAME);
			p.setString(4, aDDRESS);
			p.setInt(5, zIPCODE);
			p.setString(6, tITLE);
			p.setInt(7, rEPORTSTO);
			p.setInt(8, bIRTH_YEAR);
			p.setInt(9, pHONE_NUMBER);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "EmployeesDAOImpl [getEmployee()=" + getEmployee() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Employees createEmployee(String eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, String cITY,
			String sTATE, int zIPCODE, String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employees updateEmployee(String eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, String cITY,
			String sTATE, int zIPCODE, String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER) {
		// TODO Auto-generated method stub
		return null;
	}

}