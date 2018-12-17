package com.revature.beans;

public class Employees {
	   	int EMPLOYEE_ID;
		String FIRSTNAME;
		String LASTNAME;
		String ADDRESS; 
		String CITY; 
		String STATE; 
		int ZIPCODE;
		String TITLE; 
		int REPORTSTO; 
		int BIRTH_YEAR;
		int PHONE_NUMBER;
		
		public Employees(int EMPLOYEE_ID, String FIRSTNAME, String LASTNAME, String ADDRESS, String CITY, String STATE, int ZIPCODE, String TITLE, int REPORTSTO, int BIRTH_YEAR, int PHONE_NUMBER) {
			super();
			this.EMPLOYEE_ID = EMPLOYEE_ID;
			this.FIRSTNAME = FIRSTNAME;
			this.LASTNAME = LASTNAME;
			this.ADDRESS = ADDRESS;
			this.CITY = CITY;
			this.STATE = STATE;
			this.ZIPCODE = ZIPCODE;
			this.TITLE = TITLE;
			this.REPORTSTO = REPORTSTO;
			this.BIRTH_YEAR = BIRTH_YEAR;
			this.PHONE_NUMBER = PHONE_NUMBER;
}

		public int getEMPLOYEE_ID() {
			return EMPLOYEE_ID;
		}

		public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
			EMPLOYEE_ID = eMPLOYEE_ID;
		}

		public String getFIRSTNAME() {
			return FIRSTNAME;
		}

		public void setFIRSTNAME(String fIRSTNAME) {
			FIRSTNAME = fIRSTNAME;
		}

		public String getLASTNAME() {
			return LASTNAME;
		}

		public void setLASTNAME(String lASTNAME) {
			LASTNAME = lASTNAME;
		}

		public String getADDRESS() {
			return ADDRESS;
		}

		public void setADDRESS(String aDDRESS) {
			ADDRESS = aDDRESS;
		}

		public String getCITY() {
			return CITY;
		}

		public void setCITY(String cITY) {
			CITY = cITY;
		}

		public String getSTATE() {
			return STATE;
		}

		public void setSTATE(String sTATE) {
			STATE = sTATE;
		}

		public int getZIPCODE() {
			return ZIPCODE;
		}

		public void setZIPCODE(int zIPCODE) {
			ZIPCODE = zIPCODE;
		}

		public String getTITLE() {
			return TITLE;
		}

		public void setTITLE(String tITLE) {
			TITLE = tITLE;
		}

		public int getREPORTSO() {
			return REPORTSO;
		}

		public void setREPORTSO(int rEPORTSO) {
			REPORTSO = rEPORTSO;
		}

		public int getBIRTH_YEAR() {
			return BIRTH_YEAR;
		}

		public void setBIRTH_YEAR(int bIRTH_YEAR) {
			BIRTH_YEAR = bIRTH_YEAR;
		}

		public int getPHONE_NUMBER() {
			return PHONE_NUMBER;
		}

		public void setPHONE_NUMBER(int pHONE_NUMBER) {
			PHONE_NUMBER = pHONE_NUMBER;
		}
}