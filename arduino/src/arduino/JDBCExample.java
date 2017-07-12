package arduino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static Statement getStatement() {
		Statement stmt = null;

		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return null;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "admin", "admin");
			System.out.println("Creating database...");
			stmt = connection.createStatement();

			// String sql = "CREATE DATABASE ARDUINO";
			String sql = "CREATE TABLE ARDUINO " + "(id INTEGER not NULL, " + " distance VARCHAR(255)";
			// + " PRIMARY KEY ( id ))";
			stmt.executeUpdate(sql);
			// System.out.println("Database created successfully...");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return stmt;
	}
}