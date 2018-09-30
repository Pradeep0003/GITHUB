package com.niit.shopbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class UserDetails {
	@Id   //primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int UserId;
	private String UserName;
	private String UserDescription;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int UserId) {
		this.UserId = UserId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	public String getUserDescription() {
		return UserDescription;
	}
	public void setUserDescription(String UserDescription) {
		this.UserDescription = UserDescription;
	}
	
	
}
