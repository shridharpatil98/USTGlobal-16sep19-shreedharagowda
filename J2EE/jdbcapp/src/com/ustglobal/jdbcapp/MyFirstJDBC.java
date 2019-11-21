package com.ustglobal.jdbcapp;
import com.mysql.jdbc.Driver;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//Step 1 load driver
				FileReader reader=new FileReader("db.properties");
				
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
		
		Properties prop=new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driver"));
		String url=prop.getProperty("url");
			con=DriverManager.getConnection(url, prop);			//Step 3 issue query
			stmt=con.createStatement();
//			String sql="select * from Employee_Info";
			rs=stmt.executeQuery(prop.getProperty("select-query"));
			//Step 4 read the result set return from db
			while(rs.next()) {
				System.out.println("id="+rs.getInt(1));
				System.out.println("name="+rs.getString(2));
				System.out.println("salary="+rs.getInt(3));
				System.out.println("gender="+rs.getString(4));
			}
		}catch(Exception sql) {
			System.out.println("Database not connected"+sql);
		}finally {
			//step 5 close the connection
			try {
				if(con!=null)
					con=null;
				if(stmt!=null)
					stmt=null;
				if(rs!=null)
					rs=null;
			}catch(Exception e) {
				System.out.println("connection not closed"+e);
			}
		}
	}
}
