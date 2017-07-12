package com.thiru.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "toor");
//			System.out.println(connection);
			Statement stmt = connection.createStatement();
			// int count = stmt.executeUpdate("insert into account
			// values(1,'vasan','thiru',100)");
			// System.out.println(count+ " rows got inserted!");
			// int count = stmt.executeUpdate("update account set bal=1000 where
			// accno=1");
			// System.out.println(count+ " rows got updated!");
			// int count = stmt.executeUpdate("delete from account where
			// accno=1");
			// System.out.println(count+ " rows got deleted!");
			ResultSet rs = stmt.executeQuery("select * from account");
			System.err.println("Acc No.\tFirstName\tLastName\tBalance");
			while (rs.next()) {
				System.out
						.print(rs.getInt(1) + "\t" + rs.getString(3) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(4));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
