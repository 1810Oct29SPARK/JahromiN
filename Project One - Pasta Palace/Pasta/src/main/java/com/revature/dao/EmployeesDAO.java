package com.revature.dao;

import java.util.List;

import com.revature.beans.Employees;

public interface EmployeesDAO {
	
/*
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
		
		This is just here to remember everything I declared.
 */
	
		//Generates a List of Employees
		public List<Employees> getEmployee();
		//Gets information for one Employee
		
		public Employees deleteEmployee (int eMPLOYEE_ID);
		
		public Employees createEmployee(int eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, int zIPCODE,
				String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER);

		public Employees getEmployeeById(int eMPLOYEE_ID);

		public Employees updateEmployee(int eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, int zIPCODE,
				String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER);

		public Employees createEmployee(String eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, String cITY,
				String sTATE, int zIPCODE, String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER);

		public Employees updateEmployee(String eMPLOYEE_ID, String fIRSTNAME, String lASTNAME, String aDDRESS, String cITY,
				String sTATE, int zIPCODE, String tITLE, int rEPORTSTO, int bIRTH_YEAR, int pHONE_NUMBER);

}
