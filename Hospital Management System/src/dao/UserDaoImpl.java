package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import  model.User;


public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction tx;

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public User getUserByLoginID(String LoginID) {
		
		session = sessionFactory.openSession();
		User user = new User();
		try{
			
			tx = session.beginTransaction(); 
			user = (User) session.get(User.class,LoginID);
			tx.commit();	
		}
		catch(Exception e){
			
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			
			session.flush();
			session.clear();
			session.close();
		}
		return user;
	}

	@Override
	public User getUserByEmployeeID(String EmployeeId) {
		session = sessionFactory.openSession();
		User user = new User();
		try{
			
			tx = session.beginTransaction(); 
			user = (User) session.get(User.class,EmployeeId);
			tx.commit();	
		}
		catch(Exception e){
			
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			
			session.clear();
			session.flush();
			session.close();
		}
		return user;
	}

}
