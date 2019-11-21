package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {
	public static void main(String[] args) {
		try(FileReader in=new FileReader("csv.txt");
		BufferedReader reader=new BufferedReader(in)){
			while(reader.ready()) {
				String[] line=reader.readLine().split(",");
				System.out.println("id="+line[0]);
				System.out.println("name="+line[1]);
				System.out.println("salary="+line[2]);
				System.out.println("gender="+line[3]);
			}
			
		}catch (Exception e) {
			System.out.println("file "+e);
		}
	}
}
