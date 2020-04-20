package service;

import  model.User;

public interface UserService {

	public User getUserByLoginID(String LoginId);
	public User getUserByEmployeeID(String EmployeeId);
	}
