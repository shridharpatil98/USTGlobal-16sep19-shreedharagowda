package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dao.EmployeeDaojdbcImpl;

public class EmployeeDaoManager {
	private EmployeeDaoManager() {

	}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaojdbcImpl();

	}
}
