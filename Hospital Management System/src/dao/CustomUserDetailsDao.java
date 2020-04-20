package dao;

import  model.User;

public interface CustomUserDetailsDao {

	public User getUserByLoginID(String loginID);
}
