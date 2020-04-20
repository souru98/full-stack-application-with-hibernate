package service;



import  dao.UserDao;
import  model.User;


public class UserServiceImpl implements UserService {

	
	private UserDao userDao;
	@Override
	public User getUserByLoginID(String LoginID) {
		
		return userDao.getUserByLoginID(LoginID);
	}
	@Override
	public User getUserByEmployeeID(String EmployeeId) {
	
		return userDao.getUserByEmployeeID(EmployeeId);
	}

}
