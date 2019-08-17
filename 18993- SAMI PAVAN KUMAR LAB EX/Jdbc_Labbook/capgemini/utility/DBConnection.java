package com.capgemini.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver);
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			connection=DriverManager.getConnection(url, "INVENTORY1","INVENTYORY1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println(DBConnection.getConnection());
	}
}
