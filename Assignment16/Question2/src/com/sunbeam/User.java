package com.sunbeam;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private String dob;
	private byte status;
	private String role;

	public User() {

	}

	public User(int id, String fName, String lName, String email, String password, String dob, byte status,
			String role) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}

	public User(String fName, String lName, String email, String password, String dob, byte status, String role) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	
	public User(String fName, String lName, String email, String password, byte status) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}

}
