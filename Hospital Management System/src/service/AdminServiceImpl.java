package service;

import dao.AdminDao;
import model.User;

public class AdminServiceImpl implements AdminService {

	
	private AdminDao adminDao;
	public boolean insertUser (User user){
		return adminDao.insertUser(user);
		
	
	}
}
