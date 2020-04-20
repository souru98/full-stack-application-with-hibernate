package service;

import java.util.List;



import dao.PathologyDao;
import dao.PharmacyDao;
import model.DailyAccountOfOperationSection;


public class PharmacyServiceImpl implements PharmacyService {


	private PharmacyDao pharmacyDao;
	
	@Override
	public boolean insertInsertDailyAccountOfOperationSection(DailyAccountOfOperationSection dailyAccountOfOperationSection) {

		return pharmacyDao.insertInsertDailyAccountOfOperationSection(dailyAccountOfOperationSection);
	}

	@Override
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		return pharmacyDao.getDailyAccountOfOperationSectionList();
	}

}
