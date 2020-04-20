package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;


public class CustomUserDetailsDaoImpl implements CustomUserDetailsDao{

	
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
	public User getUserByLoginID(String loginID) {
		
		//System.out.println("Login ID: "+loginID);
		session = sessionFactory.openSession();
		User user = new User();
		try{
			
			tx = session.beginTransaction();
			user = (User) session.get(User.class,loginID);
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

}
