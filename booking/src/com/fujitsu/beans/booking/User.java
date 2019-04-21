package com.fujitsu.beans.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name ="USERS")
public class User {

	

	 @Id
	 @GeneratedValue
	 @Column(name="USER_ID",length=10)
	  private int userId;
	
	 @Column(length=20,nullable=false,unique=true)
	 private String userName;
	
	 @Column(length=10,nullable=false)
	 private String password;
	
	 @Column(length=10,nullable=false)
	 private String role;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String password, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
	
	
}
