package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//			Driver driver=new Driver();
			FileReader reader=new FileReader("db.properties");
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
		
		Properties prop=new Properties();
		prop.load(reader);
		String url=prop.getProperty("url");
			con=DriverManager.getConnection(url, prop);
//			String sql="select * from Employee_Info where id=?";
			//			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection(url, prop);
			ps=con.prepareStatement(prop.getProperty("select-query"));
			ps.setInt(1, Integer.parseInt(args[0]));
			rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("id "+rs.getInt("id"));
				System.out.println("name "+rs.getString("name"));
				System.out.println(" salary "+rs.getInt("sal"));
				System.out.println("gender "+rs.getString("gender"));
			}
		}catch(Exception se) { 
			System.out.println("db not connected "+se);
		}finally {
			try {
				if(con!=null)
					con.close();
				if(ps!=null)
					ps.close();
				if(rs!=null)
					rs.close();
			}catch(SQLException se) {
				System.out.println(" resources not closed"+se);
			}
		}

	}
}
