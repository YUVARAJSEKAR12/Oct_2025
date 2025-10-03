package com.app.pageexe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class LoginPageExe {
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		try {
			Class.forName("");
			Connection connection = DriverManager.getConnection("");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Query");
			while(rs.next()) {
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
