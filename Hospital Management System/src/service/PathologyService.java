package service;

import java.util.List;



import model.DailyAccountOfOperationSection;


public interface PathologyService {

	public boolean insert(DailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();

}
