package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {
		String path = "C:\\Users\\ADMIN\\Desktop\\java.txt";
		try {
			FileReader reader=new FileReader(path);
//			char c=(char)reader.read();
//			while(c !='\0') {
//				System.out.println(c);
//				c=(char)reader.read();
//			}
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
