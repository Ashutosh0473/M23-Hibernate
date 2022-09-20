package com.capgemini.services;

import com.capgemini.entities.User;

public interface UserService {
	
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
	public abstract User deleteUser(int Userid);

}
