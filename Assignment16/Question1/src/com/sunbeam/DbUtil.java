package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL= "jdbc:mysql://localhost:3306/Assignment";
	public static final String DB_USER= "KD4_80099_Jagdish";
	public static final String DB_PASSWD= "sunbeam";
		
	static {
		try {
			Class.forName(DB_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		return con;
	}
	
}