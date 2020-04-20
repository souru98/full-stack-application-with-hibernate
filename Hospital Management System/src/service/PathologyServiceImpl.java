package service;

import java.util.List;



import dao.PathologyDao;
import model.DailyAccountOfOperationSection;


public class PathologyServiceImpl implements PathologyService {

	
	private PathologyDao pathologyDao;
	
	@Override
	public boolean insert(DailyAccountOfOperationSection dailyAccountOfOperationSection) {

		return pathologyDao.insert(dailyAccountOfOperationSection);
	}

	@Override
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		return pathologyDao.getDailyAccountOfOperationSectionList();
	}
}
