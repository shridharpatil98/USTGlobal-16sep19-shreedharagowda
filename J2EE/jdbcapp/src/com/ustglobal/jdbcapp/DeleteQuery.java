package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DeleteQuery {
	public static void main(String[] args) {
		Connection con=null;
//		Statement stmt=null;
		PreparedStatement ps=null;
		try {
			FileReader reader=new FileReader("db.properties");
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
		
		Properties prop=new Properties();
		prop.load(reader);
		String url=prop.getProperty("url");
			con=DriverManager.getConnection(url, prop);
//			String sql="delete from Employee_Info where id=?";
//			stmt=con.createStatement();
			ps=con.prepareStatement(prop.getProperty("delete-query"));
			ps.setInt(1, Integer.parseInt(args[0]));
			int i=ps.executeUpdate();
			System.out.println(i+" rows affected");
		}catch(Exception se) {
			System.out.println("db not connected"+se);
		}finally {
			try {
				if(con!=null)
					con.close();
				if(ps!=null)
					ps.close();
			}catch(SQLException se) {
				System.out.println("resource not closed");
			}
		}
	}
}
