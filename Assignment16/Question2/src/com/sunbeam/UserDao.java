package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements AutoCloseable {

	private Connection con;

	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static Date parseDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

		try {
			java.util.Date date = sdf.parse(str);
			return date;
		} catch (ParseException e) {

			e.printStackTrace();
			return null;
		}

	}

	public int addUser(User u) throws SQLException {
		String sql = "INSERT INTO users(id, first_name, last_name, email, password, dob, status, role) VALUES(default,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			Date uDate = parseDate(u.getDob());
			java.sql.Date sqlDate = new java.sql.Date(uDate.getTime());
			stmt.setDate(5, sqlDate);
			stmt.setByte(6, u.getStatus());
			stmt.setString(7, u.getRole());

			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public int deleteUser(int id) throws SQLException {
		String sql = "DELETE FROM users WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	public int updateUser(User u, int id) throws SQLException {
		String sql = "UPDATE users SET first_name=?, last_name=?, email=?, password=?, status=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getfName());
			stmt.setString(2, u.getlName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setByte(5, u.getStatus());
			stmt.setInt(6, id);

			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}// stmt.close();

	public List<User> displayAll() throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String pwd = rs.getString("password");
					
					java.sql.Date sDate = rs.getDate("dob");
					
					java.util.Date uDate = new java.util.Date( sDate.getTime() );
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String str = sdf.format(uDate);
					
					Byte status = rs.getByte("status");
					String role = rs.getString("role");
					User u =new User(id,fname,lname,email,pwd,str,status,role);
					list.add(u);
				}
				
			} // rs.close();
			
		} // stmt.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
