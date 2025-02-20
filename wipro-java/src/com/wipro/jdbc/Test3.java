package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//to process dynamic queries

public class Test3 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro?useSSL=false", "root", "root");
		PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student id:");
		int a = scanner.nextInt();
		System.out.println("enter the student name:");
		String b = scanner.next();
		ps.setInt(1, a);
		ps.setString(2, b);
		int x = ps.executeUpdate();
		System.out.println(x + "row(s) inserted");
		connection.close();
	}
}
