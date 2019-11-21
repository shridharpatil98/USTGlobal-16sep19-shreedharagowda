package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		int count;
		try {
				FileReader reader=new FileReader("db.properties");
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
		
		Properties prop=new Properties();
		prop.load(reader);
		String url=prop.getProperty("url");
			con=DriverManager.getConnection(url, prop);
			//Step 3 Issue query
			String sql="insert into Employee_Info values(?,?,?,?)";
			stmt=con.prepareStatement(sql);
			//step 4 Execute query
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.setString(4, args[3]);
			
			count=stmt.executeUpdate();
			System.out.println(count+" rows affected");

		}catch(Exception se) {
			System.out.println("db not connected"+se);
		}finally {
			//Step 5 close resources
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se) {
				System.out.println("resource not closed");
			}
		}


	}
}
