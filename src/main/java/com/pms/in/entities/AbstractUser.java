package com.pms.in.entities;
public abstract class AbstractUser
{
	private String username;
	private String password;
	private String email;
	private String mobile;
	public AbstractUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstractUser(String username, String password, String email, String mobile) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	
	
}