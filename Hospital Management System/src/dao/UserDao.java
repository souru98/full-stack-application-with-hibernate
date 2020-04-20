package dao;

import  model.User;

public interface UserDao {

	public User getUserByLoginID(String LoginID);
	public User getUserByEmployeeID(String EmployeeId);
}
