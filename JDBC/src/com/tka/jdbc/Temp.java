package com.tka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Temp {
	public static void main(String[] args) throws SQLException {
//			student is a database
		String url = "jdbc:mysql://localhost:3306/bottle";
		String username = "root";
		String password = "striver";

		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful");

//		Step-2 : Create Database
		Statement statement = connection.createStatement();

		String createTable = "create table Milton(name varchar(10),price INT);";
		statement.executeUpdate(createTable);
		System.out.println("Table was created.");
		connection.close();
	}
}
