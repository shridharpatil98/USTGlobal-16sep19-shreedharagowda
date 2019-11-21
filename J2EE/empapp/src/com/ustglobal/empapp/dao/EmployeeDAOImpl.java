package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	public List<EmployeeBean> getEmployee() {
		String url="jdbc:mysql://localhost:3306/ust_global?user=root&password=";
		String sql="select * from Employee_Info";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			st=con.createStatement();
			rs=st.executeQuery(sql);
			ArrayList<EmployeeBean> beans=new ArrayList<EmployeeBean>();

			while(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				beans.add(bean);
			}
			return beans;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public EmployeeBean searchEmployeeData(int id) {
		String url="jdbc:mysql://localhost:3306/ust_global?user=root&password=";
		String sql="select * from Employee_Info where id=?";
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			
			st=con.prepareStatement(sql);
			st.setInt(1, id);
			rs=st.executeQuery();
			if(rs.next()) {
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setId(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}else {
				return null;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}
}
