package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class UpdateQuery {
	public static void main(String[] args) {
		Connection con=null;
		//Statement stmt=null;
		PreparedStatement pstmt=null;
		int count;
		try {
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			FileReader reader=new FileReader("db.properties");
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
		
		Properties prop=new Properties();
		prop.load(reader);
		String url=prop.getProperty("url");
			con=DriverManager.getConnection(url, prop);			//			stmt=con.createStatement();
			String sql="UPDATE Employee_Info SET name=?,sal=?,gender=? where id=?";
			pstmt=con.prepareStatement(sql);
			System.out.println("*************************");
			pstmt.setString(1, args[0]);
			pstmt.setInt(2, Integer.parseInt(args[1]));
			pstmt.setString(3, args[2]);
			pstmt.setInt(4, Integer.parseInt(args[3]));
			System.out.println("*****************************");
			count=pstmt.executeUpdate();

			System.out.println("*****************************");
			System.out.println(count+" rows affected");
		}catch(Exception se) {
			System.out.println("db not connected"+se);
		}finally {
			try {
				if(con!=null)
					con.close();
				//				if(stmt!=null)
				//					stmt.close();
				if(pstmt!=null)
					pstmt.close();
			}catch(SQLException se) {
				System.out.println("resource not closed"+se);
			}
		}
	}
}
