package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.util.EmployeeFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to show all employee data");
		System.out.println("press 2 to search employee data");
		System.out.println("press 3 to update employee data");
		System.out.println("press 4 to delete employee data");
		System.out.println("press 5 to insert employee data");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();

		EmployeeDAO impl=EmployeeFactory.getInstance();
		switch(ch) {
		case 1:
			List<EmployeeBean> results=impl.getEmployee();
			for (EmployeeBean rs : results) {
				System.out.println("id="+rs.getId());
				System.out.println("name="+rs.getName());
				System.out.println("salary="+rs.getSalary());
				System.out.println("gender="+rs.getGender());
			}
			break;
		case 2:
			EmployeeBean bean=new EmployeeBean();
			System.out.println("Enter Id");
			int id=sc.nextInt();
			bean=impl.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("id="+bean.getId());
				System.out.println("name="+bean.getName());
				System.out.println("salary="+bean.getSalary());
				System.out.println("gender="+bean.getGender());
			}else {
				System.out.println(id+" Employee is not there");
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;


		}
	}
}
