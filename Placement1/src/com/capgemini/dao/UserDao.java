package com.capgemini.dao;

import com.capgemini.entities.User;

public interface UserDao {
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
	public abstract User deleteUser(int Userid);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
