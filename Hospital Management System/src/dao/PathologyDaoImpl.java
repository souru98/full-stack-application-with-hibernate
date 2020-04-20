package dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.DailyAccountOfOperationSection;


public class PathologyDaoImpl implements PathologyDao {

	private SessionFactory sessionFactory;
	public Session session;
	public Transaction tx;
	public String sql = "";
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
	@Override
	public boolean insert(DailyAccountOfOperationSection dailyAccountOfOperationSection) {
		
		boolean retVal = false;
		session = sessionFactory.openSession(); 
		try {
			tx = session.beginTransaction();
			session.save(dailyAccountOfOperationSection);
			retVal = true;
			session.getTransaction().commit();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			retVal = false;
			session.getTransaction().rollback();
		}
		finally {
			
			session.flush();
			session.clear();
			session.close();
		}
		return retVal;
	}
	
	@Override
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		session = sessionFactory.openSession(); 
		List<DailyAccountOfOperationSection> dailyAccountOfOperationSectionList = new ArrayList<DailyAccountOfOperationSection>();
		try {
			
			tx = session.beginTransaction();
			dailyAccountOfOperationSectionList =  session.createQuery("from DailyAccountOfOperationSection").list();
			session.getTransaction().commit();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			session.getTransaction().rollback();			
		}
		finally {
			
			session.clear();
			session.flush();
			session.close();			
		}
		return dailyAccountOfOperationSectionList;
	}
}

