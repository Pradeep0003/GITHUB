package com.niit.shopbackend.dao;

import java.util.List;

import com.niit.shopbackend.model.UserDetails;

public interface UserDetailsRepository {
	public boolean addUserDetails(UserDetails userdetails);
	public boolean deleteUserdetails(int userId);
	public boolean updateUserDetails(UserDetails userdetails);
	public UserDetails getUserById(int categoryId);
	public List<UserDetails> getAllUserDetails(int userId);
}
