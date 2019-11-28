package com.ustglobal.assignment;

import java.sql.SQLException;
import java.util.Scanner;

import com.ustglobal.assignment.dao.CrudUsingJdbc;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		for(;;) {
			System.out.println("enter your choice");
			System.out.println("1: insert employee");
			System.out.println("2: update employee");
			System.out.println("3: delete employee");
			System.out.println("4: view all employee");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter salary");
				int sal=sc.nextInt();
				System.out.println("ente gender");
				String gender=sc.next();
				int i=CrudUsingJdbc.insert(id, name, sal, gender);
				System.out.println(i+"rows updated");
				break;
			case 2:
				System.out.println("enter id");
				int id1=sc.nextInt();
				System.out.println("Enter Name");
				String name1=sc.next();
				System.out.println("enter salary");
				int sal1=sc.nextInt();
				System.out.println("ente gender");
				String gender1=sc.next();
				int u=CrudUsingJdbc.update(id1, name1, sal1, gender1);
				System.out.println(u+"rows updated");
				break;
			case 3:
				System.out.println("enter id to delete employee");
				int delete=sc.nextInt();
				int d=CrudUsingJdbc.delete(delete);
				System.out.println(d+" rows deleted");
			case 4:
				try {
					CrudUsingJdbc.select();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 5:
				return;
			default:
				System.out.println("invalid option");
				break;
			}
		}
	}
}
