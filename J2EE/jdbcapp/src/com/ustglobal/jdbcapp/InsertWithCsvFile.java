package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class InsertWithCsvFile {
	public static void main(String[] args) {
		try(FileReader in=new FileReader("csv.txt");FileReader filereader=new FileReader("db.properties");
				BufferedReader reader=new BufferedReader(in)){
			Properties prop=new Properties();
			prop.load(filereader);

			try(Connection con=DriverManager.getConnection(prop.getProperty("url"), prop);
					PreparedStatement ps=con.prepareStatement(prop.getProperty("insert-query"))){
				while(reader.ready()) {
					String[] line=reader.readLine().split(",");
					ps.setInt(1, Integer.parseInt(line[0]));
					ps.setString(2, line[1]);
					ps.setInt(3, Integer.parseInt(line[2]));
					ps.setString(4, line[3]);
//					int i=ps.executeUpdate();
//					System.out.println(i+"row(s) Updated");
					ps.addBatch();
				}
				int[] i=ps.executeBatch();
				System.out.println(i.length+"rows inserted");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
