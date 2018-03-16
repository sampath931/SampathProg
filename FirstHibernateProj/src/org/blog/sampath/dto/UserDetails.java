package org.blog.sampath.dto;

import javax.persistence.Entity; 

@Entity				
public class UserDetails {

	private int userId;				// id 
	private String userName;  
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
}
