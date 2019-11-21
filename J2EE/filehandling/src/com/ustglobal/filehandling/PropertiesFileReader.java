package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
public static void main(String[] args) {
	String path="filehandling.properties";
	FileReader reader=null;
	try {
		reader=new FileReader(path);
		Properties prop=new Properties();
		prop.load(reader);
		String name=prop.getProperty("name");
		String comp=prop.getProperty("company");
		String gf=prop.getProperty("gf");
		
		System.out.println(name);
		System.out.println(comp);
		System.out.println(gf);
	}catch(IOException ie) {
		System.out.println(ie);
	}
}
}
