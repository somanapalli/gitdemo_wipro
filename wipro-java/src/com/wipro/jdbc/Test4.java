package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//program for metadata working with oracle database
public class Test4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rk", "rk");
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select * From student");
		
		ResultSetMetaData rsmd =  resultSet.getMetaData();
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			
		System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i) + " " + rsmd.getPrecision(i));	
		}
		
		connection.close();
	}
}
