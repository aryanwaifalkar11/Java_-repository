package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class practice {
	private static final String Url="jdbc:mysql://localhost:3306/internship_db";
	private static final String User="root";
	private static final String password ="manager";
	
	public static void main(String args[]) {
		try {
		Connection con =DriverManager.getConnection(Url,User,password);
		if(con !=null) {
			System.out.println("Sucessfull");
			con.close();
		}else {
			System.out.println("Not Sucessfull");
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
