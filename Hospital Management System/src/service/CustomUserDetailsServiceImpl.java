package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import  dao.CustomUserDetailsDao;
import model.User;



public class CustomUserDetailsServiceImpl implements UserService{


	CustomUserDetailsDao customUserDetailsDao;

	
	@Override
	public User getUserByLoginID(String LoginId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmployeeID(String EmployeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
