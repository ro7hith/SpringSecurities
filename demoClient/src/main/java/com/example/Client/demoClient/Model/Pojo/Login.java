package com.example.Client.demoClient.Model.Pojo;

public class Login {
	private int id;
	private String email;
	private String password;
	private String roles;

	public Login() {
		super();
	}

	public Login( String email, String password, String roles) {
		super();
		
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
}
