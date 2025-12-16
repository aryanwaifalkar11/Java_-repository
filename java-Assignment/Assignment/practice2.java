package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class practice2 {
	private static final String url ="jdbc:mysql://localhost:3306/internship_db";
	private static final String user ="root";
	private static final String pass ="manager";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,pass);
		
	} 
	
	public static void getAllStudent() {
		String sql ="select * from student";
		try {
		Connection con = getConnection();
		PreparedStatement selectStatement = con.prepareStatement(sql);
		ResultSet rs = selectStatement.executeQuery();
		
		while (rs.next()) {
			int rollno =rs.getInt(1);
			String name =rs.getString(2);
			String email = rs.getString(3);
			String course = rs.getString(5);
			System.out.println(rollno + " - " + name + " - " + email + " - " + course);
			
		}
		con.close();
		selectStatement.close();
		
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	public static void addStudent() {
		String name ="Dnyaneshwar";
		String email = "truck@gmail.com";
		String course = "JAVA";
		String sql ="insert into student (name,email,course) values (?,?,?)"; 
		
		try {
		Connection con = getConnection();
		PreparedStatement insertStatement = con.prepareStatement(sql);
		
		insertStatement.setString(1, name);
		insertStatement.setString(2, email);
		insertStatement.setString(3, course);
		insertStatement.executeUpdate();
		con.close();
		insertStatement.close();
		
		System.out.println("Student is inserted...");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateStudent() {
		int rollno =6;
		String course = "JAVA";
		String sql ="update student set course =? WHERE Rollno = ?";
		try {
		Connection con =getConnection();
		PreparedStatement UpdateStatement = con.prepareStatement(sql);
		
		UpdateStatement.setString(1, course);
		UpdateStatement.setInt(2, rollno);
		UpdateStatement.executeUpdate();
		
		con.close();
		UpdateStatement.close();
		System.out.println("student updated...");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	// delete
	public static void deleteStudent() {
		int rollno = 5;
		String sql ="delete from student where Rollno=?";
		try {
		Connection con =getConnection();
		PreparedStatement DeleteStatement = con.prepareStatement(sql);
		
		DeleteStatement.setInt(1,rollno);
		DeleteStatement.executeUpdate();
		
		con.close();
		DeleteStatement.close();
		System.out.println( "student deleted...");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		getAllStudent();
		addStudent();
		updateStudent();
		deleteStudent();
	}
	
}
