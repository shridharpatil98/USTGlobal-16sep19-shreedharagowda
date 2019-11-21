package com.ustglobal.util;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

public class EmployeeFactory {
	private EmployeeFactory() {
		
	}
	public static EmployeeDAO getInstance(){
		EmployeeDAO dao=new EmployeeDAOImpl();
		return dao;
	}
}
