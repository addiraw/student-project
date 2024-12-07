package com.student.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBO {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "localhost";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Connection successful!");
		} catch (SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
		// SQL queries
		String selectQuery = "SELECT * FROM student"; // Replace with your source table name
		String insertQuery = "INSERT INTO student_newly_enrolled (roll_no, student_id, student_name,student_father_name, student_mother_name,student_home_address) VALUES (?, ?,?, ?, ?, ?)"; // Replace
																																																// with
																																																// your
																																																// target
																																																// table
																																																// and
																																																// columns

		try (
				// Establishing the connection
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(selectQuery); // Execute SELECT query
				PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
			// Loop through the result set and insert data into the target table
			while (rs.next()) {// Retrieve data from the source table (modify based on actual columns)
				int column1Value = rs.getInt("roll_no");
				int column2Value = rs.getInt("student_id");
				String column3Value = rs.getString("student_name");
				String column4Value = rs.getString("student_father_name");
				String column5Value = rs.getString("student_mother_name");
				String column6Value = rs.getString("student_home_address");

				// Set the data to the PreparedStatement for the INSERT query
				pstmt.setInt(1, column1Value);
				pstmt.setInt(2, column2Value);
				pstmt.setString(3, column3Value);
				pstmt.setString(4, column4Value);
				pstmt.setString(5, column5Value);
				pstmt.setString(6, column6Value);

				// Execute the INSERT query
				pstmt.executeUpdate();
			}

			System.out.println("Data transferred successfully!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
