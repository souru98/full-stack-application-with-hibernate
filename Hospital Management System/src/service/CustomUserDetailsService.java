package service;

import model.User;

public interface CustomUserDetailsService {

	public User getUserByLoginID(String loginID);

}
