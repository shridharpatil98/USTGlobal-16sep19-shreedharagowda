package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class TryWithResources {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("db.properties")) {
			Properties prop=new Properties();
			prop.load(reader);

			try(Connection con=DriverManager.getConnection(prop.getProperty("url"), prop);
					PreparedStatement pstmt=con.prepareStatement(prop.getProperty("select-query"));
					ResultSet rs=pstmt.executeQuery()) {
				while(rs.next()) {
					System.out.println("id="+rs.getInt("id"));
					System.out.println("name="+rs.getString("name"));
					System.out.println("salary="+rs.getInt("sal"));
					System.out.println("gender="+rs.getString("gender"));
				}


			}catch(Exception ex) {
				System.out.println(" connctio"+ex);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("IO"+e);
		}

	}
}
