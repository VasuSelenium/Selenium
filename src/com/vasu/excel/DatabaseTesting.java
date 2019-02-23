package com.vasu.excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DatabaseTesting 
{

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","root");
		System.out.println("Database Connction Established");
		Statement stmt=con.createStatement();
		System.out.println("Statement created");
		ResultSet rs=stmt.executeQuery("Select * from selenium");
		System.out.println("Query Executed");
		
		while(rs.next())
		{
			System.out.println(rs.getString("students"));
			System.out.println(rs.getString("emailid"));
		}
		
	}

}
